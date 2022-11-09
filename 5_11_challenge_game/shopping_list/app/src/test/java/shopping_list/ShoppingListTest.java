package shopping_list;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingListTest {
  ShoppingList shoppingList;

  @Before
  public void initialize() {
    shoppingList = new ShoppingList();
  }

  @Test
  public void initialiseWithEmptyList() {
    ArrayList<String> emptyList = new ArrayList<String>();
    assertEquals(shoppingList.shoppingList, emptyList);
  }

  @Test
  public void addItem() {
    shoppingList.addItem("Beans");
    ArrayList<String> testList = new ArrayList<String>();
    testList.add("Beans");
    assertEquals(shoppingList.shoppingList, testList);
  }

  @Test
  public void getItems() {
    shoppingList.addItem("Beans");
    ArrayList<String> testList = new ArrayList<String>();
    testList.add("Beans");
    assertEquals(shoppingList.getItems(), testList);
  }      
}
