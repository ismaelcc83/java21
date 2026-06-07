package dev.eltiempovuela.java21.jeps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Jep440Test {

  @Test
  void shouldDescribeUserUsingRecordPattern() {
    Jep440.User user = Jep440.createUser("Ismael", 42);

    String result = Jep440.describeUser(user);

    assertEquals("Name: Ismael, age: 42", result);
  }

  @Test
  void shouldReturnUnknownObjectWhenObjectIsNotUser() {
    String result = Jep440.describeUser("plain text");

    assertEquals("Unknown object", result);
  }

  @Test
  void shouldReturnUnknownObjectWhenObjectIsNull() {
    String result = Jep440.describeUser(null);

    assertEquals("Unknown object", result);
  }
}
