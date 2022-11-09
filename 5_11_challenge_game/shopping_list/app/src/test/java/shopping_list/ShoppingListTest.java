package shopping_list;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingListTest {
  ShoppingList shoppingList;
  ArrayList<String> testList;

  @Before
  public void initialize() {
    shoppingList = new ShoppingList();
    testList = new ArrayList<String>();
  }

  @Test
  public void initialiseWithEmptyList() {
    assertEquals(shoppingList.shoppingList, testList);
  }

  @Test
  public void addItem() {
    shoppingList.addItem("Beans");
    testList.add("Beans");
    assertEquals(shoppingList.shoppingList, testList);
  }

  @Test
  public void getItems() {
    shoppingList.addItem("Beans");
    testList.add("Beans");
    assertEquals(shoppingList.getItems(), testList);
  }      
}
