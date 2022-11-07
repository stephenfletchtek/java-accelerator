package todo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TodoTest {
  @Test public void instantiate() {
    // Initialised with empty list of tasks
    Todo todo = new Todo();
    asserEquals("Empty todo list", String.valueOf(""), todo.getTasks());
  }

  // addTask takes a String and adds it to the list

  // getTasks returns list of tasks
}
