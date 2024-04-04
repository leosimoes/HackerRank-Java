# HackerRank - Java - Introduction - Java Stdin e Stdout II

## Tarefa
Neste desafio, você deve ler um inteiro, um duplo e uma String de stdin,
em seguida, imprima os valores de acordo com as instruções na seção Formato de saída abaixo.

Para tornar o problema um pouco mais fácil, uma parte do código é fornecida no editor.

Observação: recomendamos concluir Java Stdin e Stdout I antes de tentar este desafio.

## Formato de entrada
Existem três linhas de entrada:
1. A primeira linha contém um número inteiro.
2. A segunda linha contém um duplo.
3. A terceira linha contém uma String.


## Formato de saída
Existem três linhas de saída:

Na primeira linha, imprima String: seguido pela String inalterada lida em stdin.

Na segunda linha, imprima Double: seguido pela leitura dupla inalterada de stdin.

Na terceira linha, imprima Int: seguido pelo número inteiro inalterado lido em stdin.

Para facilitar o problema, uma parte do código já vem fornecida no editor.

Nota: Se você usar o método `nextLine()` imediatamente após o método `nextInt()`, 
lembre-se de que `nextInt()` lê tokens inteiros; devido a esta, o último caractere de nova linha para aquela linha de 
entrada inteira ainda está na fila no buffer de entrada e o próximo `nextLine()` estará lendo o restante da linha 
inteira (que está vazia).


## Exemplo de entrada
|                                         |
|-----------------------------------------|
| 42                                      |
| 3.1415                                  |
| Welcome to HackerRank's Java tutorials! |


## Exemplo de saída
|                                                 |
|-------------------------------------------------|
| String: Welcome to HackerRank's Java tutorials! |
| Double: 3.1415                                  |
| Int: 42                                         |


## Referências
HackerRank - Java - Java Stdin e Stdout II:
https://www.hackerrank.com/challenges/java-stdin-stdout/problem