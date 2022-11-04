package get_price_label;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PriceDisplayTest {
  @Test public void teapotPrice() {
    PriceDisplay priceDisplay = new PriceDisplay();
      assertEquals("Teapot, 10.99 should equal The price for item: Teapot is 10.99", String.valueOf("The price for item: Teapot is 10.99"), priceDisplay.getPriceLabel("Teapot", 10.99));
  }
}
