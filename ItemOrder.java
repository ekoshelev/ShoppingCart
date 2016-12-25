// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #4, 3/14/16
// This is the ItemOrder class, which represents an item by its quantity and item and returns information.
public class ItemOrder implements Comparable<ItemOrder>{
	
	private Item item;
	private int quantity;
	
	public ItemOrder(Item item, int quantity){ //This constructs the item order object, which consists of the item and its quantity.
		this.item = item;
		this.quantity = quantity;
	}
	
	public double getPrice(){ //This returns the price of the quantity of items.
		return item.priceFor(quantity);
	}
	
	public Item getItem(){ //This returns the item.
		return item; 
	}
	
	private int getQuantity(){ //This returns the quantity.
		return quantity; 
	}
	
	public String toString(){ //This converts the information to a string form.
		return "( " + item.getName() + ", " + quantity + ")";
	}
	
	public int compareTo(ItemOrder other){ //This compares the quantity of items so they can be sorted in catalog.
		return quantity - other.getQuantity();
	}
}
