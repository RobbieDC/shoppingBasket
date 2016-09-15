package shopping_basket;

import java.util.*;

public class Cashier {

  Customer customer;

  public Cashier( Customer customer ) {
    this.customer = customer;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public double calculateTotal() {
    ArrayList<Item> basket = customer.getBasket();
    double basketValue = 0;
    for( Item item : basket ) {
      double itemPrice = item.getPrice();
      basketValue += itemPrice;
    }
    return basketValue;
  }

  public ArrayList<Item> getBogofItems() {
    ArrayList<Item> basket = customer.getBasket();
    ArrayList<Item> bogofItems = new ArrayList<Item>();
    for( Item item : basket ) {
      boolean itemBogof = item.checkBogof();
      if(itemBogof == true) {
        bogofItems.add(item);
      }
    }
    return bogofItems;
  }

  // make bogof hashmap
  public double calculateBogofDiscount() {
    ArrayList<Item> bogofItems = getBogofItems();
    for( Item item : bogofItems ) {

    }
  }

}