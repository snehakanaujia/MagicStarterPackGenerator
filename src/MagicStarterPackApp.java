import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * This is the Magic Starter Pack Generator application that serves as the Client 
 * in the Builder Pattern this app is based on. It is responsible for creating the
 * app's GUI and holds and instance of a MagicStarterPackDirector and concrete 
 * instances of the MagicItemBuilder that it passes to the Director to ultimately 
 * retrieve a finished MagicItem Product from it. Based on how the user interacts 
 * with the application it can create new descriptions of a magic wand, magic potion
 * and magic artifact. 
 * 
 * @author Sneha Kanaujia
 *
 */
public class MagicStarterPackApp extends JPanel {
	//Director that will use the Builder interface to construct a product
	private MagicStarterPackDirector director;
	
	/**
	 * The main method creates a MagicStarterPack client and displays an app with 
	 * various buttons that allow you to create descriptions of different magic items
	 * as part of a magic starter pack for a new witch or wizard (possibly for an RPG game).
	 * @param args arguments
	 */
	public static void main (String[] args) {
		//Makes the main frame and adds the app JPanel
		JFrame mainFrame = new JFrame("Magic Starter Pack Generator");
		mainFrame.add(new MagicStarterPackApp());
		mainFrame.setSize(new Dimension(450, 450));
		mainFrame.setVisible(true);
		
		//Terminates the app when the user closes it
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public MagicStarterPackApp () {
		//Creates and instantiates the magic item builders
		MagicItemBuilder magicWandBuilder = new MagicWandBuilder();
		MagicItemBuilder magicPotionBuilder = new MagicPotionBuilder();
		MagicItemBuilder magicArtifactBuilder = new MagicArtifactBuilder();
		
		//Panel to hold all the app instructions, text panes and buttons
		JPanel appPanel = new JPanel();
		appPanel.setLayout(new BoxLayout(appPanel, BoxLayout.Y_AXIS));

		//Label for general instructions on how to create the starter pack items
		JLabel instructions = new JLabel("<html>Click the buttons below to create components of your magic starter pack!</html>");
		
		//Text pane for the magic wand description
		JTextPane magicWandText = new JTextPane();
		magicWandText.setEditable(false);
		magicWandText.setSize(new Dimension(400, 100));
		magicWandText.setText("Click the button below to get a magic wand. Want a new one? Click again!");

		//Create a button for the magic wand builder
		JButton magicWandButton = new JButton("Summon your wand!");
		magicWandButton.addActionListener(new ActionListener() {
			/**
			 * Builds a new magic wand description/product when the magicWandButton is clicked.
			 * @param e event
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				//Creates a magic starter pack director using a magic wand builder as the parameter
				director = new MagicStarterPackDirector(magicWandBuilder);
				//Builds the magic wand description
				director.constructMagicItem();
				//Sets the text pane to the new magic wand description
				magicWandText.setText(director.getMagicItem());
			}
		});

		//Text pane for the magic potion description
		JTextPane magicPotionText = new JTextPane();
		magicPotionText.setEditable(false);
		magicPotionText.setSize(new Dimension(400, 100));
		magicPotionText.setText("Click the button below to get a magic potion. Want a new one? Click again!");

		//Create a button for the magic potion builder
		JButton magicPotionButton = new JButton("Brew your potion!");
		magicPotionButton.addActionListener(new ActionListener() {
			/**
			 * Builds a new magic potion description/product when the magicPotionButton is clicked.
			 * @param e event
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				//Creates a magic starter pack director using a magic potion builder as the parameter
				director = new MagicStarterPackDirector(magicPotionBuilder);
				//Builds the magic potion description
				director.constructMagicItem();
				//Sets the text pane to the new magic potion description
				magicPotionText.setText(director.getMagicItem());
			}
		});

		//Text pane for the magic artifact description
		JTextPane magicArtifactText = new JTextPane();
		magicArtifactText.setEditable(false);
		magicArtifactText.setSize(new Dimension(400, 100));
		magicArtifactText.setText("Click the button below to get a magic artifact. Want a new one? Click again!");

		//Create a button for the magic artifact builder
		JButton magicArtifactButton = new JButton("Conjure your magic artifact!");
		magicArtifactButton.addActionListener(new ActionListener() {
			/**
			 * Builds a new magic artifact description/product when the magicArtifactButton is clicked.
			 * @param e event
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				//Creates a magic starter pack director using a magic artifact builder as the parameter
				director = new MagicStarterPackDirector(magicArtifactBuilder);
				//Builds the magic artifact description
				director.constructMagicItem();
				//Sets the text pane to the new magic artifact description
				magicArtifactText.setText(director.getMagicItem());
			}
		});
		
		appPanel.add(instructions);
		appPanel.add(magicWandText);
		appPanel.add(magicWandButton);
		appPanel.add(magicPotionText);
		appPanel.add(magicPotionButton);
		appPanel.add(magicArtifactText);
		appPanel.add(magicArtifactButton);
		
		this.setLayout(new BorderLayout());
		this.add(appPanel, BorderLayout.CENTER);
	}

}
