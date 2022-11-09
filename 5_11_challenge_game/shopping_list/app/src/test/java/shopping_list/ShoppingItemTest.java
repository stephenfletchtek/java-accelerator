package shopping_list;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingItemTest {
  @Test
  public void makeFalafels() {
    ShoppingItem falafels = new ShoppingItem("Falafels", 3.20);
    assertEquals(falafels.name, "Falafels");
    Double price = 3.20;
    assertEquals(falafels.price, price);
  }  
}
