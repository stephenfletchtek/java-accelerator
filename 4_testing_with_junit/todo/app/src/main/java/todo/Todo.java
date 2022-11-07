package todo;

import java.util.ArrayList;

public class Todo {
  ArrayList<String> todoList = new ArrayList<String>();

  public ArrayList<String> getTasks() {
    return todoList;
  }

  // Makers made this return the task so it could be inspected without calling getTasks()
  public void addTask(String task) {
    todoList.add(task);
  }
}
