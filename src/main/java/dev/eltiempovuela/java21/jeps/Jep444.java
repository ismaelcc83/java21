package dev.eltiempovuela.java21.jeps;

// JEP 444 - Virtual Threads
public class Jep444 {

  public static void execute() {
    System.out.println("JEP 444 - Virtual Threads");
    System.out.println("=========================");

    Thread virtualThread =
        Thread.startVirtualThread(
            () -> {
              System.out.println("Running inside a virtual thread");
              System.out.println("Thread name: " + Thread.currentThread());
            });

    try {
      virtualThread.join();
    } catch (InterruptedException exception) {
      Thread.currentThread().interrupt();
      System.out.println("Virtual thread interrupted");
    }
  }
}
