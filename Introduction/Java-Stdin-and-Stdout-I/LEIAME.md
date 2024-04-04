# HackerRank - Java - Introduction - Java Stdin e Stdout I

A maioria dos desafios do HackerRank exige que você leia a entrada de stdin (entrada padrão) e grave a saída em stdout (saída padrão).

Uma maneira popular de ler a entrada do stdin é usar a classe Scanner e especificar o fluxo de entrada como System.in.

Por exemplo:

`Scanner scanner = new Scanner(System.in);`

`String myString = scanner.next();`

`int myInt = scanner.nextInt();`

`scanner.close();`

`System.out.println("myString is: " + myString);`

`System.out.println("myInt is: " + myInt);`

O código acima cria um objeto Scanner nomeado e o utiliza para ler uma String e um int.
Em seguida, ele fecha o objeto Scanner porque não há mais entrada para ler e imprime em stdout
usando `System.out.println(String)`.

Então, se nossa entrada for:

`Hi 5`

Nosso código irá imprimir:

`myString is: Hi`

`myInt is: 5`

Alternativamente, você pode usar a classe BufferedReader.


## Tarefa

Neste desafio, você deve ler números inteiros de stdin e depois imprimi-los em stdout.

Cada número inteiro deve ser impresso em uma nova linha.

Para tornar o problema um pouco mais fácil, uma parte do código é fornecida no editor abaixo.


## Formato de entrada
Existem linhas de entrada e cada linha contém um único número inteiro.


## Exemplo de entrada
|     |
|-----|
| 42  |
| 100 |
| 125 |


## Exemplo de saída
|     |
|-----|
| 42  |
| 100 |
| 125 |


## Referências
HackerRank - Java - Java Stdin e Stdout I:
https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem