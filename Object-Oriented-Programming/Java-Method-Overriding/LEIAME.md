# HackerRank - Java - Object Oriented Programming - Method Overriding

Quando uma subclasse herda de uma superclasse, ela também herda seus métodos; no entanto, também pode substituir o
métodos de superclasse (bem como declarar e implementar novos).

Considere a seguinte classe de esportes:

```java
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
```

A seguir, criamos uma classe Soccer que herda da classe Sports.
Podemos substituir o método getName e retornar uma string diferente, específica da subclasse:

```java
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
```

Nota: Ao substituir um método, você deve precedê-lo com a anotação @Override.
O(s) parâmetro(s) e o tipo de retorno de um método substituído devem ser exatamente iguais aos do método herdado
do supertipo.


## Tarefa
Complete o código em seu editor escrevendo um método getNumberOfTeamMembers substituído que imprime a mesma instrução
como o método getNumberOfTeamMembers da superclasse, exceto que substitui n por 11 (o número de
jogadores de um time de futebol).


## Formato de saída
Quando executado, seu código concluído deverá imprimir o seguinte:

Esportes Genéricos
Cada equipe tem n jogadores em Esportes Genéricos
Aula de futebol
Cada equipe tem 11 jogadores na classe de futebol


## Referências
HackerRank - Java - Method Overriding:
https://www.hackerrank.com/challenges/java-method-overriding/problem