package dev.eltiempovuela.java21.jeps;

// JEP 440 - Record Patterns
public class Jep440 {

  public static String describeUser(Object object) {
    if (object instanceof User(String name, int age)) {
      return "Name: " + name + ", age: " + age;
    }

    return "Unknown object";
  }

  public static User createUser(String name, int age) {
    return new User(name, age);
  }

  public static void execute() {
    System.out.println("JEP 440 - Record Patterns");
    System.out.println("=========================");

    User user = createUser("Ismael", 40);
    System.out.println(describeUser(user));
  }

  record User(String name, int age) {}
}
