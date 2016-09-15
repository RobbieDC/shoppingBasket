package shopping_basket;

public class Item {

  private String type;
  private double price;
  private boolean bogof;

  public Item( String type, double price, boolean bogof ) {
    this.type = type;
    this.price = price;
    this.bogof = bogof;
  }

  public String getType() {
    return this.type;
  }

  public double getPrice() {
    return this.price;
  }

  public boolean checkBogof() {
    return this.bogof;
  }

  public void setPrice( double newPrice ) {
    this.price = newPrice;
  }

  public void toggleBogof( boolean newBogof ) {
    this.bogof = newBogof;
  }

}