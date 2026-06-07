package dev.eltiempovuela.java21.jeps;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

// JEP 431 - Sequenced Collections
public class Jep431 {

  public static SequencedCollection<String> createNames() {
    SequencedCollection<String> names = new ArrayList<>();
    names.add("Ismael");
    names.add("Silvia");
    names.add("Eric");
    return names;
  }

  public static SequencedCollection<String> addBoundaryNames(SequencedCollection<String> names) {
    names.addFirst("First");
    names.addLast("Last");
    return names;
  }

  public static List<String> reversedNames(SequencedCollection<String> names) {
    return names.reversed().stream().toList();
  }

  public static void execute() {
    System.out.println("JEP 431 - Sequenced Collections");
    System.out.println("================================");

    SequencedCollection<String> names = createNames();

    System.out.println("Collection: " + names);
    System.out.println("First element: " + names.getFirst());
    System.out.println("Last element: " + names.getLast());

    addBoundaryNames(names);

    System.out.println("After addFirst/addLast: " + names);
    System.out.println("Reversed: " + names.reversed());
  }
}
