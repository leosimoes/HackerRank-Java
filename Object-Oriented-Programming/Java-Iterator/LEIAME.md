# HackerRank - Java - Object Oriented Programming - Iterator

A classe Java Iterator pode ajudá-lo a iterar cada elemento de uma coleção.

Aqui está um exemplo simples:
```java
import java.util.*;
public class Example{

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
```

Neste problema você precisa completar um método func.
O método recebe um `ArrayList` como entrada.
Nesse ArrayList há um ou mais números inteiros, então há uma string especial "###",
depois disso, há uma ou mais outras strings.

Um exemplo de `ArrayList` pode ter esta aparência:

```
element[0]=>42
element[1]=>10
element[2]=>"###"
element[3]=>"Hello"
element[4]=>"Java"
```

Você tem que modificar o método func editando no máximo 2 linhas para que o código só imprima os elementos após o
string especial "###". Para o exemplo acima a saída será:

```
Hello
Java
```

Nota: O stdin não contém a string "###", ela é adicionada no método principal.

Para restaurar o código original no editor, clique no ícone superior esquerdo do editor e crie um novo buffer.


## Referências
HackerRank - Java - Iterator:
https://www.hackerrank.com/challenges/java-iterator/problem