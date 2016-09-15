import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class ItemTest {

  Item tomato;

  @Before
  public void before() {
    tomato = new Item("tomato", 0.20, true);
  } 

  @Test
  public void hasType() {
    assertEquals( "tomato", tomato.getType() );
  }

  @Test
  public void hasPrice() {
    assertEquals( 0.20, tomato.getPrice(), 0.001 );
  }

  @Test
  public void hasBogof() {
    assertEquals( true, tomato.checkBogof() );
  }

  @Test
  public void canSetPrice() {
    tomato.setPrice( 0.40 );
    assertEquals( 0.40, tomato.getPrice(), 0.001 );
  }

  @Test
  public void canToggleBogof() {
    tomato.toggleBogof( false );
    assertEquals( false, tomato.checkBogof() );
  }

}