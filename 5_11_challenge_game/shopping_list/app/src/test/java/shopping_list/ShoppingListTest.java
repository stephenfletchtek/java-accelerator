package shopping_list;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingListTest {
    @Test
    public void initialiseWithEmptyList() {
        ShoppingList shoppingList = new ShoppingList();
        ArrayList<String> emptyList = new ArrayList<String>();
        assertEquals(shoppingList.shoppingList, emptyList);
    }

    @Test
    public void addItem() {
      ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem("Beans");
        ArrayList<String> testList = new ArrayList<String>();
        testList.add("Beans");
        assertEquals(shoppingList.shoppingList, testList);
    }
}
