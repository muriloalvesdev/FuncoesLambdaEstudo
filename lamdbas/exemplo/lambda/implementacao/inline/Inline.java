package br.com.lamdbas.exemplo.lambda.implementacao.inline;

import br.com.lamdbas.exemplo.lambda.Matematica;

public class Inline {

  public static void main(String[] args) {
    // testando inline:
    calcular((v1, v2) -> v1 + v2); // soma
    calcular((v1, v2) -> v1 - v2); // subtrai
    calcular((v1, v2) -> v1 / v2); // divide
    calcular((v1, v2) -> v1 * v2); // multiplica
  }

  private static void calcular(Matematica matematica) {
    System.out.println(matematica.operar(10, 10));
  }

}
