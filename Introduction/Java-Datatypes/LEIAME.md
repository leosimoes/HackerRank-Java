# HackerRank - Java - Introduction - Java Datatypes

Java possui 8 tipos de dados primitivos; char, boolean, byte, short, int, long, float e double.

Neste exercício, trabalharemos com as primitivas usadas para armazenar valores inteiros (byte, short, int e long):

- Um byte é um número inteiro assinado de 8 bits.
- Um short é um número inteiro assinado de 16 bits.
- Um int é um número inteiro assinado de 32 bits.
- Um long é um número inteiro assinado de 64 bits.

- Dado um número inteiro de entrada, você deve determinar quais tipos de dados primitivos são capazes de armazenar adequadamente essa entrada.

Para começar, uma parte da solução é fornecida no editor.

Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html


## Formato de entrada

A primeira linha contém um inteiro, T, denotando o número de casos de teste.

Cada caso de teste, T, é composto por uma única linha com um número inteiro, n, que pode ser arbitrariamente grande ou pequeno.


## Formato de saída

Para cada variável de entrada n e tipo de dados primitivo apropriado,
você deve determinar se as primitivas fornecidas são capazes de armazená-lo.
Se sim, imprima:

n pode ser instalado em:
* dataType

Se houver mais de um tipo de dados apropriado, imprima cada um em sua própria linha e ordene-os por tamanho
(ou seja: mordida <curto <int <longo).

Se o número não puder ser armazenado em uma das quatro primitivas mencionadas, imprima a linha:

`n can't be fitted anywhere.`


## Exemplo de entrada

|                                      |
|--------------------------------------|
| 5                                    |
| -150                                 |
| 150000                               |
| 1500000000                           |
| 213333333333333333333333333333333333 |
| -100000000000000                     |


## Exemplo de saída

|                                                                |
|----------------------------------------------------------------|
| -150 can be fitted in:                                         |
| * short                                                        |
| * int                                                          |
| * long                                                         |
| 150000 can be fitted in:                                       |
| * int                                                          |
| * long                                                         |
| 1500000000 can be fitted in:                                   |
| * int                                                          |
| * long                                                         |
| 213333333333333333333333333333333333 can't be fitted anywhere. |
| -100000000000000 can be fitted in:                             |
| * long                                                         |
| Explanation                                                    |

-150 pode ser armazenado em short, int ou long.

21333333333333333333333333333333333 é muito grande e está fora do intervalo de valores permitido
para os tipos de dados primitivos discutidos neste problema.


## Referências
HackerRank - Java - Java Int to String:
https://www.hackerrank.com/challenges/java-datatypes/problem

The Java™ Tutorials - Primitive Data Types:
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html