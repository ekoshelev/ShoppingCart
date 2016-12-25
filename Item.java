// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #4, 3/14/16
// This is the Item class, which constructs an item based on the inputed information.
import java.text.NumberFormat;

public class Item {
	
	private String name;
	private int bulkquantity=0;
	private double bulkprice=0;
	private double price;
	
	public Item(String name,double price){ //This throws a negative price, and constructs an item object with a name and a price.
	    if (price < 0) {
	        throw new IllegalArgumentException("Check for negative price.");
	}
		this.name = name;
		this.price = price;		
	}
	
	public Item(String name, double price, int bulkquantity, double bulkprice){ //This constructs an item with a price, quantity, bulk quantity, and bulk price.
	    if (price < 0 || bulkquantity <0 || bulkprice <0) {
	        throw new IllegalArgumentException("Check for negative price or quantity."); //Throws any negative values.
	    }
		this.name = name;
		this.price = price;
		this.bulkquantity = bulkquantity;
		this.bulkprice = bulkprice;
	}
	
	public double priceFor(int quantity){ //This returns the price for a certain number of an item.
	    if (quantity < 0) {
	        throw new IllegalArgumentException("Check for negative quantity."); //This throws a negative quantity.
	    }
		double totalprice=0; //This declares the total price for a quantity of an item.
		if (bulkquantity !=0){ 
			totalprice = (double)(quantity/bulkquantity) * bulkprice + (double)(quantity - ((quantity/bulkquantity) * bulkquantity)) * price; //This is the algorithm to calculate the cost.
		} else {
			totalprice = (double)quantity*price;
		}
		return totalprice;
	}
	
	public String toString(){ //This converts the information to a string.
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String price1 = nf.format(price);
		if (bulkquantity == 0){
			return name + ", " + price1;
		} else {
			String bulkprice1 = nf.format(bulkprice);
			return name + ", " + price1 +  "( " +  bulkquantity + " for" + bulkprice1 +  " ) ";
		}
	}
	
	public String getName(){ //This returns the name.
		return name;
	}
	
	public double getPrice() { //This returns a price.
		return price;
	}
}
