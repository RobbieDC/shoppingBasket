import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;
import java.util.*;

public class CashierTest {

  Cashier cashier;
  Customer davey;
  Item sandwich1;
  Item sandwich2;
  Item harrisGin;

  @Before
  public void before() {
    sandwich1 = new Item( "Cheap coronation chicken", 1.50, true );
    sandwich2 = new Item( "Fancy coronation chicken", 3.75, true );
    harrisGin = new Item( "Harris gin", 30.95, false );
    davey = new Customer( "Davey", true );
    davey.addItem( sandwich1 );
    davey.addItem( sandwich2 );
    davey.addItem( harrisGin );
    cashier = new Cashier( davey );
  }

  @Test
  public void hasCustomer() {
    String customerName = cashier.getCustomer().getName();
    assertEquals( "Davey", customerName );
  }

  @Test
  public void canCalculateTotal() {
    double basketValue = cashier.calculateTotal();
    assertEquals( 36.20, basketValue, 0.001 );
  }

  @Test
  public void canGetBogofItems() {
    ArrayList<Item> bogofItems = cashier.getBogofItems();
    assertEquals( 2, bogofItems.size() );
  }

}