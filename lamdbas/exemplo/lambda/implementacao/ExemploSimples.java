package br.com.lamdbas.exemplo.lambda.implementacao;

import br.com.lamdbas.exemplo.strategy.Forno;

public class ExemploSimples {

  public void lambda() {
    Forno forno = new Forno();
    forno.assar(() -> System.out.println("Pizza lambda"));

    /*
     * A instrucao Lambda, simplesmente vai criar uma implementacao de uma pizza e tudo o que for
     * passado dentro do metodo assar() é como se dinâmicamente o Java estivesse criando uma Classe
     * que implementa a Interface Pizza, assim como as Classes Calabreza e Napolitano.
     * 
     * E a funcao "() ->  System.out.println("Pizza lambda")" é como se fosse toda a implementação
     * do metodo preparar() das Classes Calabreza e Napolitano.
     * 
     */
    
  }

}
