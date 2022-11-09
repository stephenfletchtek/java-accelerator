package shopping_list;

import java.util.ArrayList;

public class ShoppingList {
  ArrayList<String> shoppingList;
  
  public ShoppingList() {
    shoppingList = new ArrayList<String>();
  }

  public void addItem(String item) {
    shoppingList.add(item);
  }
}
