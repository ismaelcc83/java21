package dev.eltiempovuela.java21.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Jep441Test {

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
  void shouldPrintPatternMatchingForSwitchExamples() {
    Jep441.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("JEP 441 - Pattern Matching for switch"));
    assertTrue(output.contains("It is a String: Hello"));
    assertTrue(output.contains("It is an Integer: 21"));
    assertTrue(output.contains("It is null"));
  }
}
