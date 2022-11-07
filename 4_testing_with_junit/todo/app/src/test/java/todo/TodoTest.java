package todo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.List;

public class TodoTest {
  @Test public void instantiate() {
    // Initialised with empty list of tasks
    Todo todo = new Todo();
    assertEquals("Empty todo list", List.of(), todo.getTasks());
  }

  // addTask takes a String and adds it to the list

  // getTasks returns list of tasks
}
