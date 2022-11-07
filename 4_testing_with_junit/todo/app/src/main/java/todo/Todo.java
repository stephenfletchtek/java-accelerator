package todo;

import java.util.*;

public class Todo {
  List<String> todoList = new ArrayList<String>();

  public List<String> getTasks() {
    return todoList;
  }

  public void addTask(String task) {
    todoList.add(task);
  }
}
