import java.util.Random;

/**
 * The MagicArtifactBuilder is a concrete implementation of MagicItemBuilder interface.
 * This creates a description of a magic artifact using the following structure:
 * "It's a [NOUN] made of [MATERIAL]. It's [CHARACTERISTIC DESCRIPTION] and looks
 * [CHARACTERISTIC DESCRIPTION]. It [BACKSTORY/ABILITY]."
 * 
 * @author Sneha Kanaujia
 *
 */
public class MagicArtifactBuilder implements MagicItemBuilder{
	
	//The product under construction
	private String magicArtifactDescrip;
	
	//Arrays to hold words corresponding to the artifact description blanks
	private String[] artifact = {"mirror", "chalice", "helmet", "spear", "earring", "flower", "telescope", "cape", "harp", "necklace", "bottle", "box", "gauntlet", "rose", "shoe", "bell", "staff", "spoon", "orb", "vase", "coat", "oil lamp", "rod", "sword", "chalice", "gown", "clock", "trumpet", "tunic", "ruby", "watch", "tablet", "sabre", "amphora", "scarf", "ring", "lute", "strange musical instrument", "pendant", "dagger", "flute", "crown", "chest", "scepter", "violin", "button", "belt", "statuette", "locket"};
	private String[] material = {"steel", "granite", "cherry wood", "alabaster", "obsidian", "crystal", "bone", "clay", "gold", "mithril", "linen", "jackalope antler", "nacre", "basilisk horn", "glass", "mahogany", "a metal you've never seen before", "porceline", "cotton", "coral", "copper", "ivory", "silk", "iron", "diamond", "leather", "antimatter", "Bakelite", "jade", "satin", "marble", "plastic", "silver", "oak"};
	private String[] characteristic1 = {"is foreign in design", "is set with sapphires", "is set with gemstones", "is cold to the touch", "unusally shiny", "is of a strange design", "is quite simple in design", "like it was made for dwarves", "sparkles in the light", "rather frightening", "is carved with runes", "is rather slippery", "is warm to the touch", "slowly changes colors", "is decorated in a leafy design", "has been painted with pictures of fantastic animals", "is plated with gold", "is covered with finely-wrought vines", "is decorated with animal teeth", "unsually ornate"};
	private String[] characteristic2 = {"like it was made by the gods", "very exotic", "quite fragile", "carefully crafted", "strikingly beautiful", "cheaply produced", "like it was made for a child", "like it was made for a giant", "extremely old", "just like your mother's", "like it was made by merpeople", "like it was made by aliens", "extremely strange", "like it was made by the elves", "very fragile", "pretty ordinary", "quite tacky", "pretty sturdy", "fairly new"};
	private String[] backstoryOrAbility = {"used to belong to the royal family", "was made by a pirate and has a habit of causing explosions when misused", "is haunted by an angry spirit", "used to belong to a noblewoman and may explode if improperly handled", "is actually used to power another device", "was made by a wizard and many battles were fought for its ownership", "causes paranoia and they say those who use it are forever changed..", "has the power to record events and play them back later", "is said to contain the living essence of a dwarf and it comes from another dimension", "has a habit of exploding when misused", "slowly causes misfortune in the owner and its previous owner began having hallucinations shortly after acquiring it", "is generally used to make its owner invincible and it seems to call to you..", "has been known to cause megalomania in its owner and it's available for sale - for a price", "was made by a sorceress and its last owner seemed eager to get rid of it", "slowly causes insanity in the owner and the very survival of the kingdom depends on it", "slowly drains the life-force from all who use it", "is said to contain the living essence of a fairy and it protects the owner from harm", "seems to call to you", "has been known to cause increased intelligence in its owner and many battles were fought for its ownership", "has the ability to alter reality", "gives off a foul stench", "gives off a dark aura", "once belonged to a famous warrior", "can store energy for future use", "comes from another dimension", "can summon rainstorms", "is probably used for controlling fire", "is probably a cheap imitation of the real thing", "has the power to make plants grow quickly", "can hold and store almost limitless amounts of water", "has the power to heal mortal injuries and it's available for sale - for a price..", "has highly destructive powers", "can transform people into other creatures", "brings fortune to whomever owns it", "has been in a museum for years", "has the power to grant wishes... but not necessarily the way you had in mind", "can be used to teleport people and objects to far-away places", "has the ability to alter history", "can change people and objects to crystal", "can duplicate other objects", "can create food"};
	
	//Generates a random index to get random words from the word bank arrays
	private Random rand = new Random();
	
	/**
	 * The constructor instantiates the String representation of the Product.
	 */
	public MagicArtifactBuilder() {
		magicArtifactDescrip = "";
	}

	/**
	 * The method that's meant to be called first and adds an introductory sentence to the Product String:
	 * "It's a [NOUN] made of [MATERIAL]."
	 */
	@Override
	public void buildIntroduction() {
		//Adjusts use of "a" or "an" based on what the artifact is
		String thing = artifact[rand.nextInt(artifact.length)];
		if(thing.substring(0, 1).equals("a") || thing.substring(0, 1).equals("e") || thing.substring(0, 1).equals("i") || thing.substring(0, 1).equals("o") || thing.substring(0, 1).equals("u")) {
			magicArtifactDescrip += "It's an ";
		}
		else {
			magicArtifactDescrip += "It's a ";
		}
		magicArtifactDescrip += thing + " made of " + material[rand.nextInt(material.length)] + ". ";
	}

	/**
	 * The method that's meant to be called second adds a description of product characteristics:
	 * "It's [CHARACTERISTIC DESCRIPTION] and looks [CHARACTERISTIC DESCRIPTION]."
	 */
	@Override
	public void buildCharacteristicDescrip() {
		magicArtifactDescrip += "It " + characteristic1[rand.nextInt(characteristic1.length)] + " and looks " + characteristic2[rand.nextInt(characteristic2.length)] + ". ";
	}

	/**
	 * The method that's meant to be called third adds a background story, or explains 
	 * the history or the abilities of the product:
	 * "It [BACKSTORY/ABILITY]."
	 */
	@Override
	public void buildDetails() {
		magicArtifactDescrip += "It " + backstoryOrAbility[rand.nextInt(backstoryOrAbility.length)] + ". ";
	}

	/**
	 * This method returns the magic artifact/product (presumably after it's been correctly
	 * built).
	 * @return String representation of the magic artifact/product
	 */
	@Override
	public String getMagicItem() {
		return magicArtifactDescrip;
	}

}
