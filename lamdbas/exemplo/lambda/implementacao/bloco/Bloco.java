package br.com.lamdbas.exemplo.lambda.implementacao.bloco;

import br.com.lamdbas.exemplo.lambda.Matematica;

public class Bloco {

  public static void main(String[] args) {
    calcular((v1, v2) -> {
      System.out.println("Corpo dentro do bloco de soma");
      return v1 + v2;
    });

    calcular((v1, v2) -> {
      System.out.println("Corpo dentro do bloco de subtração");
      return v1 - v2;
    });

    calcular((v1, v2) -> {
      System.out.println("Corpo dentro do bloco de divisão");
      return v1 / v2;
    });

    calcular((v1, v2) -> {
      System.out.println("Corpo dentro do bloco de multiplicação");
      return v1 * v2;
    });
  }

  private static void calcular(Matematica matematica) {
    System.out.println(matematica.operar(10, 10));
  }
}
