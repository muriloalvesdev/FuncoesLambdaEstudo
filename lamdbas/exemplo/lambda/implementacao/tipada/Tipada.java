package br.com.lamdbas.exemplo.lambda.implementacao.tipada;

import br.com.lamdbas.exemplo.lambda.Matematica;

public class Tipada {

  public static void main(String[] args) {
    calcular((Integer v1, Integer v2) -> {
      System.out.println("Corpo dentro do bloco");
      return v1 + v2;
    });

  }

  private static void calcular(Matematica matematica) {
    System.out.println(matematica.operar(10, 10));
  }
}
