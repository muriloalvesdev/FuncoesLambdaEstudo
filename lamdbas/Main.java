package br.com.lamdbas;

import br.com.lamdbas.exemplo.strategy.Forno;
import br.com.lamdbas.exemplo.strategy.implementacao.Calabreza;
import br.com.lamdbas.exemplo.strategy.implementacao.Napolitano;

public class Main {

  public static void main(String[] args) {
    System.out.println("Iniciando exemplo da implementacao do Padrão Strategy");
    exemploStrategy();
  }

  private static void exemploStrategy() {
    Forno forno = new Forno();
    Calabreza calabreza = new Calabreza();

    forno.assar(calabreza); // forno recebe a implementacao de pizza e assim executa o metodo
                            // preparar() da pizza de calabreza

    Napolitano napolitano = new Napolitano();
    forno.assar(napolitano); // forno recebe qualquer implementacao de pizza, ou seja, neste momento
                             // tambem executa o metodo preparar(), mas agora o metodo é da pizza
                             // napolitano

  }
}
