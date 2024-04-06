# HackerRank - Java - Object Oriented Programming - Java Abstract Class

Uma classe abstrata Java é uma classe que não pode ser instanciada.

Isso significa que você não pode criar novas instâncias de uma classe abstrata.

Funciona como base para subclasses.

Você deve aprender sobre a herança Java antes de tentar este desafio.

A seguir está um exemplo de classe abstrata:

```java
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
```
Se você tentar criar uma instância desta classe como a linha a seguir, você receberá um erro:

```
Book new_novel=new Book();
```

Você precisa criar outra classe que estenda a classe abstrata.
Então você pode criar uma instância da nova classe.

Observe que o método setTitle também é abstrato e não possui corpo.
Isso significa que você deve implementar o corpo desse método na classe filha.

No editor, fornecemos a classe abstrata Book e uma classe Main.
Na classe Main, criamos uma instância de uma classe chamada MyBook.
Sua tarefa é escrever apenas a classe MyBook.

Sua aula não deve ser pública.

## Exemplo de entrada
`A tale of two cities`


## Exemplo de saída
`The title is: A tale of two cities`


## Referências
HackerRank - Java - Java Abstract Class:
https://www.hackerrank.com/challenges/java-abstract-class