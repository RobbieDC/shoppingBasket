import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class CustomerTest {

  Customer gilliohn;
  Item avocado;

  @Before
  public void before() {
    gilliohn = new Customer( "Gilliohn", true );
    avocado = new Item( "avocado", 0.70, false );
  }

  @Test
  public void hasName() {
    assertEquals( "Gilliohn", gilliohn.getName() );
  }

  @Test
  public void checkHasLoyaltyCard() {
    assertEquals( true, gilliohn.getLoyaltyCard() );
  }

  @Test
  public void hasEmptyBasket() {
    assertEquals( 0, gilliohn.basketSize() );
  }

  @Test
  public void canAddToBasket() {
    gilliohn.addItem( avocado );
    assertEquals( 1, gilliohn.basketSize() );
  }

  @Test
  public void canRemoveItem() {
    gilliohn.addItem( avocado );
    gilliohn.removeItem( avocado );
    assertEquals( 0, gilliohn.basketSize() );
  }

  @Test
  public void canEmptyBasket() {
    gilliohn.addItem( avocado );
    gilliohn.emptyBasket();
    assertEquals( 0, gilliohn.basketSize() );
  }

}