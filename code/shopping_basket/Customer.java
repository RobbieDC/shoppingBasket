package shopping_basket;

import java.util.*;

public class Customer {

  String name;
  Boolean loyaltyCard;
  ArrayList<Item> basket;

  public Customer( String name, boolean loyaltyCard ) {
    this.name = name;
    this.loyaltyCard = loyaltyCard;
    this.basket = new ArrayList<Item>();
  }

  public String getName() {
    return this.name;
  }

  public boolean getLoyaltyCard() {
    return this.loyaltyCard;
  }

  public ArrayList<Item> getBasket() {
    return this.basket;
  }

  public int basketSize() {
    return basket.size();
  }

  public void addItem( Item item ) {
    basket.add( item );
  }

  public void removeItem( Item item ) {
    basket.remove( item );
  }

  public void emptyBasket() {
    basket.clear();
  }

}