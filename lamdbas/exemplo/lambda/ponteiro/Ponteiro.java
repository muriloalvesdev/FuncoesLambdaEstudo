package br.com.lamdbas.exemplo.lambda.ponteiro;

public class Ponteiro {
  public static void main(String[] args) {
    Runnable run = () -> System.out.println("Thread 1 em uma funcao lambda inline");

    Runnable run2 = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("Thread 2 dentro de uma funcao lambda em bloco");
      }
    };

    Thread thread = new Thread(run);
    thread.start();

    Thread thread2 = new Thread(run2);
    thread2.start();

  }
}
