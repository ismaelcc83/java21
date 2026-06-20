package dev.eltiempovuela.java21.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Jep444Test {

  private final PrintStream originalOut = System.out;
  private ByteArrayOutputStream outputStream;

  @BeforeEach
  void setUp() {
    outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void shouldPrintVirtualThreadExecutionDetails() {
    Jep444.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("JEP 444 - Virtual Threads"));
    assertTrue(output.contains("Running inside a virtual thread"));
    assertTrue(output.contains("Thread name:"));
  }
}
