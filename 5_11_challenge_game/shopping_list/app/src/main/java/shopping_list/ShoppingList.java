package shopping_list;

import java.util.ArrayList;

public class ShoppingList {
  ArrayList<ShoppingItem> shoppingList;
  
  public ShoppingList() {
    shoppingList = new ArrayList<ShoppingItem>();
  }

  public void addItem(ShoppingItem item) {
    shoppingList.add(item);
  }

  public ArrayList<ShoppingItem> getItems() {
    return shoppingList;
  }
}
