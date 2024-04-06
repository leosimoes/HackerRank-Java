# HackerRank - Java - Object Oriented Programming - Inheritance I

Usando herança, uma classe pode adquirir as propriedades de outras.
Considere a seguinte classe Animal:

```java
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
```

Esta classe possui apenas um método, walk. 
A seguir, queremos criar uma classe Bird que também possua um método fly. 
Fazemos isso usando a palavra-chave `extends`:

```java
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}
```

Finalmente, podemos criar um objeto Bird que pode voar e andar.

```java
public class Solution{
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}
```

O código acima irá imprimir:

```
I am walking
I am flying
```

Isso significa que um objeto Bird possui todas as propriedades que um objeto Animal possui, bem como algumas propriedades adicionais.
propriedades únicas.

O código acima é fornecido para você em seu editor.
Você deve adicionar um método sing à classe Bird e, em seguida, modificar o método main de acordo para que o código imprima o
seguintes linhas:

```
I am walking
I am flying
I am singing
```


## Referências
HackerRank - Java - Inheritance I:
https://www.hackerrank.com/challenges/java-inheritance-1/problem