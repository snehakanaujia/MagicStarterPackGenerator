import java.util.Random;

/**
 * The MagicPotionBuilder is a concrete implementation of MagicItemBuilder interface.
 * This creates a description of a magic potion using the following structure:
 * "This [SHAPE] bottle is made of [GLASS ADJECTIVE] [COLOR ADJECTIVE] glass.
 * It has a [SIZE] neck, stands about [HEIGHT] inches tall, and it has [A SIMPLE OR NO] printed label.
 * This [ADJECTIVE] liquid is [COLOR] in color and [AFFECT]."
 * 
 * @author Sneha Kanaujia
 *
 * Word sources:
 * https://harrypotter.fandom.com/wiki/List_of_potions
 *
 */
public class MagicPotionBuilder implements MagicItemBuilder{
	
	//The product under construction
	private String magicPotionDescrip;
	
	//Arrays to hold words corresponding to the artifact description blanks
	private String[] shape = {"teardrop-shaped", "rectangular", "cylindrical", "apple-shaped", "round", "coffin-shaped", "pear-shaped", "ovoid"};
	private String[] glassAdj = {"transparent", "opaque", "translucent"};
	private String[] bottleColor = {"lavender", "lilac", "indigo", "purple", "lime green", "crimson", "dark blue", "bright purple", "bright green", "dark green", "sky blue", "bright yellow", "plum purple", "dark gray", "magenta", "smokey pink", "sea green", "ice blue", "turquoise", "rose pink", "royal purple", "bright orange", "lemon-yellow", "slate blue", "dark brown", "aquamarine", "amber", "azure"};
	private String[] neckLength = {"short", "mid-length", "long"};
	private String[] heights = {"three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen"};
	private String[] labelDetail = {"no", "a simple handwritten", "a simple printed", "a colorful", "an embellished handwritten", "a blotched unreadable"};
	private String[] liquidAdj = {"syrupy", "shimmering", "translucent", "gooey", "glowing", "bubbling", "steaming"};
	private String[] liquidColor = {"vivid red", "silver", "gold", "purple", "lime green", "crimson", "vivid blue", "bright purple", "bright green", "sky blue", "bright yellow", "plum purple", "dark gray", "magenta", "smokey pink", "sea green", "brass", "turquoise", "rose pink", "royal purple", "bright orange", "lemon-yellow", "slate blue", "dark brown", "aquamarine", "amber", "azure"};
	private String[] affect = {"heals paralysis", "reverses the effects of uncommon poisons", "does not create real love, just powerful obsession", "depending on the amount taken, ages the drinker to various ages", "causes uncontrollable speaking of nonsense", "apparently increases the taker's brain power", "makes the taker confused and reckless", "makes the taker very beautiful", "makes the taker able to move through black fire uninjured", "replenishes the taker's blood if they have been injured and lost blood", "most likely gets rid of acne", "calms the user of shock, trauma, etc", "confuses the taker", "kills those who come into contact with it", "makes the taker dizzy and lightheaded", "gives the drinker a fiery breath", "can heal sickly dragons", "places the taker in a sleep that is dreamless", "puts the taker in extreme pain", "induces a sense of inexplicable, irrational happiness upon the drinker", "is highly explosive when it touches or is touched by an outside source", "protects the taker from being burnt", "makes the taker forgetful", "produces a gas that induces choking and possibly suffocates the taker", "gives the taker extra endurance", "shows the taker's worst traits and habits", "causes the taker's hair to stand on end", "most likely cures hiccups", "is presumed to give the taker an energy boost", "makes the taker invisible", "induces lockjaw", "makes the taker laugh uncontrollably", "is most likely a laxative", "makes the taker fall in love with the person that has given it to them", "serves as an antidote to love potions", "is most likely a poison or produces other bad effects", "causes hair on drinker's head to grow out rapidly", "enhances the drinker's memory", "is used to silence people and/or various objects", "soothes and heals painful cuts and abrasions", "restores the drinker's sight", "temporarily transforms the drinker into another person", "temporarily turns the drinker's head into a pumpkin", "reverts spell effects", "causes the drinker to shrink", "makes hair more manageable", "makes the drinker tell the truth", "alters the drinker's voice", "enhances the clarity of thought of the drinker", "prevents the drinker from falling asleep and/or awakens from drugging or concussion", "prevents werewolves from losing their minds post-transformation", "is antiseptic"};
	
	//Generates a random index to get random words from the word bank arrays
	private Random rand = new Random();
	
	/**
	 * The constructor instantiates the String representation of the Product.
	 */
	public MagicPotionBuilder() {
		magicPotionDescrip = "";
	}

	/**
	 * The method that's meant to be called first and adds an introductory sentence to the Product String:
	 * "This [SHAPE] bottle is made of [GLASS ADJECTIVE] [COLOR ADJECTIVE] glass."
	 */
	@Override
	public void buildIntroduction() {
		magicPotionDescrip += "This " + shape[rand.nextInt(shape.length)] + " bottle is made of " + glassAdj[rand.nextInt(glassAdj.length)] + " " + bottleColor[rand.nextInt(bottleColor.length)] + " glass. ";
	}

	/**
	 * The method that's meant to be called second adds a description of product characteristics:
	 * "It has a [SIZE] neck, stands about [HEIGHT] inches tall, and it has [A SIMPLE OR NO] printed label."
	 */
	@Override
	public void buildCharacteristicDescrip() {
		magicPotionDescrip += "It has a " + neckLength[rand.nextInt(neckLength.length)] + " neck, stands about " + heights[rand.nextInt(heights.length)] + " inches tall, and it has " + labelDetail[rand.nextInt(labelDetail.length)] + " label. ";
	}

	/**
	 * The method that's meant to be called third adds a background story, or explains 
	 * the history or the abilities of the product:
	 * "This [ADJECTIVE] liquid is [COLOR] in color and [AFFECT]."
	 */
	@Override
	public void buildDetails() {
		magicPotionDescrip += "The " + liquidAdj[rand.nextInt(liquidAdj.length)] + " liquid within is " + liquidColor[rand.nextInt(liquidColor.length)] + " in color and " + affect[rand.nextInt(affect.length)] + ". ";
	}
	
	/**
	 * This method returns the magic potion/product (presumably after it's been correctly
	 * built).
	 * @return String representation of the magic potion/product
	 */
	@Override
	public String getMagicItem() {
		return magicPotionDescrip;
	}

}
