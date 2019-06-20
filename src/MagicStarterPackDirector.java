/**
 * The MagicStarterPackDirector is passed in a specific concrete builder to construct it's
 * specific product in a step-wise manner. The constructMagicItem method is responsible for
 * correctly calling the BuildPart methods in a certain order to construct the magic item in
 * the right way. It dictates the construction of the magic item Product and is able to return
 * the finished String representation of it through its getMagicItem method.
 * 
 * @author Sneha Kanaujia
 *
 */
public class MagicStarterPackDirector {
	//The builder that will construct the appropriate product
	private MagicItemBuilder magicItemBuilder;
	
	/**
	 * The constructor receives a builder and saves it to the global builder variable
	 * to be correctly manipulated in other methods.
	 * @param builder to be used in other methods
	 */
	public MagicStarterPackDirector(MagicItemBuilder builder) {
		magicItemBuilder = builder;
	}
	
	/**
	 * Calls the magic item builder methods in the correct order to create the product.
	 */
	public void constructMagicItem() {
		magicItemBuilder.buildIntroduction();
		magicItemBuilder.buildCharacteristicDescrip();
		magicItemBuilder.buildDetails();
	}
	
	/**
	 * Gets the String representation of the finished magic item/product.
	 * The method is meant to be called after product construction.
	 * @return String representation of the fully built magic item
	 */
	public String getMagicItem() {
		return magicItemBuilder.getMagicItem();
	}
}
