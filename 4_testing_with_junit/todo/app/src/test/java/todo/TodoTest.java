package todo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.List;

public class TodoTest {
  // Initialised with empty list of tasks
  @Test public void instantiate() { 
    Todo todo = new Todo();
    assertEquals("Empty todo list", List.of(), todo.getTasks());
  }

  // addTask takes a String and adds it to the list
  @Test public void addTask() {
    Todo todo = new Todo();
    todo.addTask("First task");
    assertEquals("One task in todo list", List.of("First task"), todo.getTasks());
  }

  // getTasks returns list of tasks
  @Test public void threeTasks() {
    Todo todo = new Todo();
    todo.addTask("second task");
    todo.addTask("third task");
    assertEquals("list of three tasks", List.of("First task", "second task", "third task"), todo.getTasks());
  }
}
