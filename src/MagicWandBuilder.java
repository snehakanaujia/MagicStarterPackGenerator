import java.util.Random;

/**
 * The MagicWandBuilder is a concrete implementation of MagicItemBuilder interface.
 * This creates a description of a magic wand using the following structure:
 * "The wand is made of [WOOD TYPE] and has a core of [MAGIC ANIMAL FUR/FEATHER/HAIR].
 * It is [LENGTH] inches long and is [ADJECTIVE]. It is [COLOR] and is [ADVERB] carved."
 * 
 * @author Sneha Kanaujia
 * 
 * Word sources: 
 * https://www.pottermore.com/writing-by-jk-rowling/wand-woods
 * https://harrypotter.fandom.com/wiki/Wand_core
 *
 */
public class MagicWandBuilder implements MagicItemBuilder{
	
	//The product under construction
	private String magicWandDescrip;
	
	//Arrays to hold words corresponding to the wand description blanks
	private String[] woodTypes = {"blue spruce", "willow", "juniper", "cherry wood", "birch wood", "blackthorn", "yew", "black walnut", "elderberry wood", "acacia", "beech", "ash", "aspen", "cedar", "cypress", "chestnut", "dogwood", "ebony", "elm", "hawthorn", "fir", "hazel", "laurel", "maple", "pine", "rowan", "redwood", "sycamore"};
	private String[] wandCore = {"kneazle whiskers", "dragon heartstring", "phoenix feather", "unicorn tail hair", "thunderbird tail feather", "wampus cat hair", "jackalope antler", "kelpie hair", "basilisk horn", "coral"};
	private String[] lengths = {"15 and 3/4", "11 and 3/4", "8", "9", "10", "11", "12", "13", "14", "15", "8 and 3/4", "9 and 3/4", "10 and 3/4", "11 and 3/4", "12 and 3/4", "13 and 3/4", "14 and 3/4"};
	private String[] stiffness = {"springy", "quite rigid", "brittle", "pliable", "inflexible", "unyielding", "bendy"};
	private String[] color = {"darkly colored", "very darkly colored", "somewhat darkly colored", "of a medium tone", "somewhat lightly colored", "lightly colored"};
	private String[] carvingAdverb = {"delicately", "beautifully", "elegantly", "intricately", "ornately", "roughly", "plainly", "deftly"};
	
	//Generates a random index to get random words from the word bank arrays
	private Random rand = new Random();
	
	/**
	 * The constructor instantiates the String representation of the Product.
	 */
	public MagicWandBuilder() {
		magicWandDescrip = "";
	}

	/**
	 * The method that's meant to be called first and adds an introductory sentence to the Product String:
	 * "The wand is made of [WOOD TYPE] and has a core of [MAGIC ANIMAL FUR/FEATHER/HAIR]."
	 */
	@Override
	public void buildIntroduction() {
		magicWandDescrip += "The wand is made of " + woodTypes[rand.nextInt(woodTypes.length)] + " and has a core of " + wandCore[rand.nextInt(wandCore.length)] + ". ";
	}

	/**
	 * The method that's meant to be called second adds a description of product characteristics:
	 * "It is [LENGTH] inches long and is [ADJECTIVE]."
	 */
	@Override
	public void buildCharacteristicDescrip() {
		magicWandDescrip += "It is " + lengths[rand.nextInt(lengths.length)] + " inches long and is " + stiffness[rand.nextInt(stiffness.length)] + ". ";
	}

	/**
	 * The method that's meant to be called third adds a description of product details:
	 * "It is [COLOR] and is [ADVERB] carved."
	 */
	@Override
	public void buildDetails() {
		magicWandDescrip += "It is " + color[rand.nextInt(color.length)] + " and is " + carvingAdverb[rand.nextInt(carvingAdverb.length)] + " carved. ";
	}
	
	/**
	 * This method returns the magic wand/product (presumably after it's been correctly
	 * built).
	 * @return String representation of the magic wand/product
	 */
	@Override
	public String getMagicItem() {
		return magicWandDescrip;
	}
}
