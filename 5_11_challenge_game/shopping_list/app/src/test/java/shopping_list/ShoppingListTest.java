package shopping_list;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingListTest {
  ShoppingList shoppingList;
  ArrayList<ShoppingItem> testList;

  @Before
  public void initialize() {
    shoppingList = new ShoppingList();
    testList = new ArrayList<ShoppingItem>();
  }

  @Test
  public void initialiseWithEmptyList() {
    assertEquals(shoppingList.shoppingList, testList);
  }

  @Test
  public void addItem() {
    shoppingList.addItem(new ShoppingItem("Falafels", 3.20));
    shoppingList.addItem(new ShoppingItem("Houmous", 2.45));
    assertEquals(shoppingList.shoppingList.size(), 2);
  }

  @Test
  public void getItems() {
    testList.add(new ShoppingItem("Falafels", 3.20));
    testList.add(new ShoppingItem("Houmous", 2.45));
    shoppingList.addItem(testList.get(0));
    shoppingList.addItem(testList.get(1));
    assertEquals(shoppingList.getItems(), testList);
  }      
}
