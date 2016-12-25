// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #4, 3/14/16
// This is the shopping cart class, which makes a list of item orders and sorts it by quantity.
import java.util.*;
import java.util.Collections;

public class ShoppingCart  {
	
	private ArrayList<ItemOrder> cart;
	private boolean discount = false;
	
	public ShoppingCart(){ //This creates an array list of item orders.
		 cart = new ArrayList<ItemOrder>();
	}
	 
	public void add(ItemOrder order){ //This adds an item order to the list, and replaces it if it is already in the list.
		for (int i = 0; i < cart.size(); i++) {
			 if(cart.get(i).getItem().getName() == order.getItem().getName()){ //If the name of an order matches the name of another, remove the order and add it to the end.
				 cart.remove(i);
			 }
		}
		cart.add(order);
	} 
	
	public void setDiscount(boolean value){ //This determines if there is a discount.
		 this.discount = value;
	}
	 
	public double getTotal(){ //This returns the total price of the cart.
		 double totalprice=0;
		 for (int i=0; i< cart.size(); i++){
		 totalprice += cart.get(i).getPrice(); //This goes through the array and adds each price to the total price.
		 }
		 if (discount == true){
			totalprice = .9*totalprice; 
		 } 
			 return totalprice;	 
	 }
	 
	 public void sortCart(){ //This uses the compareTo method in ItemOrder to sort the items.
		 Collections.sort(cart);
	 }
	
	 public String toString(){ //This prints the array list. I tried to fix it so that it would only print if the length of the list was greater than 0, but I got an error.
		 return cart.toString();
	 }
}
