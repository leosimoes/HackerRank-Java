# HackerRank - Java - Advanced - Reflection Attributes

A reflexão JAVA é uma ferramenta muito poderosa para inspecionar os atributos de uma classe em tempo de execução.
Por exemplo, podemos recuperar a lista de campos públicos de uma classe usando getDeclaredMethods().

Neste problema, você receberá uma classe Solution no editor.
Você tem que preencher as linhas incompletas para que imprima todos os métodos de outra classe chamada Student em
ordem alfabética.
Anexaremos seu código à classe Student antes de executá-lo.

A classe Student fica assim:

```java
class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    // ......
    // ......
    // some more methods
    // ......
}
```

Você deve imprimir todos os métodos da classe do aluno em ordem alfabética assim:

```
anothermethod
getName
setEmail
setId
......
......
some more methods
......
```

Não há entrada/saída de amostra para este problema. 
Se você pressionar "Run Code", ele será compilado, mas não mostrará nenhuma saída.

Dica: veja a documentação do oracle para mais detalhes sobre 
[JAVA Reflection Methods and Fields](https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html)


## Referências
HackerRank - Java - Reflection Attributes:
https://www.hackerrank.com/challenges/java-reflection-attributes/problem