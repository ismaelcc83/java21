package dev.eltiempovuela.java21.jeps;

// JEP 441 - Pattern Matching for switch
public class Jep441 {

  public static void execute() {
    System.out.println("JEP 441 - Pattern Matching for switch");
    System.out.println("=====================================");

    System.out.println(describe("Hello"));
    System.out.println(describe(21));
    System.out.println(describe(null));
  }

  private static String describe(Object object) {
    return switch (object) {
      case String text -> "It is a String: " + text;
      case Integer number -> "It is an Integer: " + number;
      case null -> "It is null";
      default -> "Unknown object";
    };
  }
}
