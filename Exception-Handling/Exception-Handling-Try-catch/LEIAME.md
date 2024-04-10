# HackerRank - Java - Exception Handling - Exception Handling (Try-catch)

O tratamento de exceções é o processo de responder à ocorrência, durante o cálculo, de exceções -
condições anômalas ou excepcionais que exigem processamento especial – muitas vezes alterando o fluxo normal de execução 
do programa. (Wikipédia)

Java possui mecanismo integrado para lidar com exceções.
Usando a instrução try, podemos testar erros em um bloco de código.
O bloco catch contém o código que diz o que fazer se ocorrer uma exceção.

Este problema testará seu conhecimento no bloco try-catch.

Você receberá dois inteiros xey como entrada, você deve calcular x/y.
Se x e y não forem inteiros assinados de 32 bits ou se y for zero, ocorrerá uma exceção e você deverá reportá-la.
Leia o exemplo de entrada/saída para saber o que relatar em caso de exceções.


## Exemplo de entrada 0:
```
10
3
```


## Exemplo de saída 0:
```
3
```


## Exemplo de entrada 1:
```
10
Olá
```


## Exemplo de saída 1:
```
java.util.InputMismatchException
```


## Exemplo de entrada 2:
```
10
0
```


## Exemplo de saída 2:
```
java.lang.ArithmeticException: / por zero
```


## Exemplo de entrada 3:
```
23.323
0
```


## Referências
HackerRank - Java - Exception Handling (Try-catch):
https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem