// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #4, 3/14/16
// This is the Catalog class, which stores items.
import java.util.*;

public class Catalog {
	
	private String name;
	private ArrayList<Item> catalog;
	
	public Catalog(String name){ //This constructs the catalog object with an arraylist for items.
		this.name = name;
		catalog = new ArrayList<Item>();
	}
	
	public void add(Item item){ //This adds an item to the list.
		catalog.add(item);
	}
	
	public int size(){ //This returns the size of the list.
		return catalog.size();
	}
	
	public Item get(int index){ //This returns the item at a certain index of the list.
		return catalog.get(index);
	}
	
	public String getName(){ //This returns the name of an item.
		return name;
	}
}
