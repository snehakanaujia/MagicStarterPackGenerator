/**
 * The MagicItemBuilder is an interface that holds all the necessary methods/steps 
 * a builder would need to construct a magic item description.
 * 
 * @author Sneha Kanaujia
 *
 */
public interface MagicItemBuilder {

	/**
	 * Builds an introduction to the object, ex. what it is and what it's made of.
	 */
	public void buildIntroduction();
	
	/**
	 * Builds a description of main visual characteristics of the object ex. length, size, or decorating features
	 */
	public void buildCharacteristicDescrip();
	
	/**
	 * Builds additional details about the object ex. it's history, contents or additional characteristics
	 */
	public void buildDetails();
	
	/**
	 * This method returns the magic item/product (presumably after it's been correctly
	 * built).
	 * @return String representation of the magic item/product
	 */
	public String getMagicItem();
	
}
