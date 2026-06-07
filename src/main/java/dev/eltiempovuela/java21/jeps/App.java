package dev.eltiempovuela.java21.jeps;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int option;

    do {
      printMenu();

      System.out.print("Choose an option: ");
      option = readOption(scanner);

      System.out.println();

      switch (option) {
        case 1 -> Jep431.execute(); // Sequenced Collections
        case 2 -> Jep440.execute(); // Record Patterns
        case 3 -> Jep441.execute(); // Pattern Matching for switch
        case 4 -> Jep444.execute(); // Virtual Threads
        case 0 -> System.out.println("Exiting application...");
        default -> System.out.println("Invalid option. Please choose a valid JEP.");
      }

      System.out.println();

    } while (option != 0);

    scanner.close();
  }

  private static void printMenu() {
    System.out.println("======================================");
    System.out.println(" Java 21 JEP Practical Exploration");
    System.out.println("======================================");
    System.out.println("1. JEP 431 - Sequenced Collections");
    System.out.println("2. JEP 440 - Record Patterns");
    System.out.println("3. JEP 441 - Pattern Matching for switch");
    System.out.println("4. JEP 444 - Virtual Threads");
    System.out.println("0. Exit");
    System.out.println("======================================");
  }

  private static int readOption(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.print("Please enter a number: ");
      scanner.next();
    }

    return scanner.nextInt();
  }
}
