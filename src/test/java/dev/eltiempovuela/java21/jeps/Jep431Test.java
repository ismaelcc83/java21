package dev.eltiempovuela.java21.jeps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.SequencedCollection;
import org.junit.jupiter.api.Test;

class Jep431Test {

  @Test
  void shouldCreateSequencedCollectionWithExpectedFirstAndLastElements() {
    SequencedCollection<String> names = Jep431.createNames();

    assertEquals("Ismael", names.getFirst());
    assertEquals("Eric", names.getLast());
    assertEquals(List.of("Ismael", "Silvia", "Eric"), names.stream().toList());
  }

  @Test
  void shouldAddElementsAtTheBeginningAndAtTheEnd() {
    SequencedCollection<String> names = Jep431.createNames();

    SequencedCollection<String> result = Jep431.addBoundaryNames(names);

    assertEquals("First", result.getFirst());
    assertEquals("Last", result.getLast());
    assertEquals(List.of("First", "Ismael", "Silvia", "Eric", "Last"), result.stream().toList());
  }

  @Test
  void shouldReturnNamesInReverseOrder() {
    SequencedCollection<String> names = Jep431.createNames();

    List<String> result = Jep431.reversedNames(names);

    assertEquals(List.of("Eric", "Silvia", "Ismael"), result);
  }
}
