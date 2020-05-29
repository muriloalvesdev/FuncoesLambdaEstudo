## Lambda 

### Um Lambda tem 3 sintaxes diferentes:
 

#### 1.0 Inline: Mais compacta, menos verbosa e mais rápida.
  1 - Só pode ter 1 linha.
  2 - Não pode delimitar o corpo com {}
  3 - Não pode usar palavra `return` se precisar retornar algo, pois é automático.
  4 - Pode ou não declarar os tipos dos parâmetros.
  
#### 2.0 Em Bloco: Maior e mais verbosa
  1 - Pode ter quantas linhas quiser.
  2 - Não precisa declarar o tipo dos parâmetros.
  3 - É obrigatório delimitar o corpo com {}
  4 - É obrigatório utilizar o `return` SE precisar retornar algo.

#### 3.0 Forma Tipada: Mesmas regras do formato Em Bloco.
           Só que declarando todos os tipos dos parâmetros. 
           Usado em casos específicos quando existe ambiguidade 
           na passagem de parâmetros e o compilador não consegue 
           inferir o tipo automaticamente.
