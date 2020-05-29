package br.com.lamdbas.exemplo.strategy;

public class Forno {

  public void assar(Pizza pizza) {
    pizza.preparar(); // operacao polimorfica
  }
}
