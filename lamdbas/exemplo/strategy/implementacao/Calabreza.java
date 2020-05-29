package br.com.lamdbas.exemplo.strategy.implementacao;

import br.com.lamdbas.exemplo.strategy.Pizza;

public class Calabreza implements Pizza {

  @Override
  public void preparar() {
    System.out.println("Preparando pizza de calabreza");
  }

}
