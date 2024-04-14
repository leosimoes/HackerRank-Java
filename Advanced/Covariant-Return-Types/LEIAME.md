# HackerRank - Java - Advanced - Covariant Return Types

Java permite tipos de retorno covariantes, o que significa que você pode variar seu tipo de retorno, desde que retorne um
subclasse do seu tipo de retorno especificado.

A substituição de método permite que uma subclasse substitua o comportamento de um método de superclasse existente 
e especifique um retorno tipo que é alguma subclasse do tipo de retorno original. 
É uma prática recomendada usar a anotação @Override quando substituindo um método de superclasse.

Implemente as classes e métodos detalhados no diagrama abaixo:

![Diagrama-Classes](https://s3.amazonaws.com/hr-assets/0/1523891844-c66f1555af-class.png)

Você receberá um código parcialmente concluído no editor onde o método principal leva o nome de um estado
(ou seja, WestBengal ou AndhraPradesh) e imprime a flor nacional desse estado usando as classes e
métodos escritos por você.

Nota: Não use modificadores de acesso em suas declarações de classe.


## Recursos
Tipo de retorno covariante
Tipo de covariante Java


## Formato de entrada
O código bloqueado lê uma única string denotando o nome de uma subclasse de Estado (ou seja, WestBengal, Karnataka ou
AndhraPradesh) e testa os métodos associados a essa subclasse. Você não é responsável pela leitura de qualquer
entrada de stdin.


## Formato de saída
A saída é tratada para você pelo código bloqueado, que cria o objeto correspondente à string de entrada
nome da classe e, em seguida, imprime o nome retornado pelo método whatsYourName da flor nacional dessa classe.

Você não é responsável por imprimir nada no stdout.


## Exemplo de entrada 0
```Andhra Pradesh```


## Exemplo de saída 0
```Lily```


## Explicação 0
O método yourNationalFlower de um objeto AndhraPradesh retorna uma instância da classe Lily,
e o método whatsYourName da classe Lily retorna Lily, que é impressa pelo verificador de código oculto.


## Referências
HackerRank - Java - Covariant Return Types:
https://www.hackerrank.com/challenges/java-covariance/problem