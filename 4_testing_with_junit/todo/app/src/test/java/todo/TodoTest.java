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
    todo.addTask("Hello");
    assertEquals("Hello in todo list", List.of("Hello"), todo.getTasks());
  }

  // getTasks returns list of tasks
}
