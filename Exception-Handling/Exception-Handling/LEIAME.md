# HackerRank - Java - Exception Handling - Exception Handling

Você deve calcular a potência de um número implementando uma calculadora.
Crie uma classe MyCalculator que consiste em um único método long power(int, int).
Este método usa dois inteiros, n e p, como parâmetros e encontra $$n^p$$.
Se ou for negativo, então o método deve lançar uma exceção que diz "`n ou p deve ser não negativo``".
Além disso, se ambos e forem zero, o método deverá lançar uma exceção que diz "`n e p não devem ser zero.``"

Por exemplo, -4 e -5 resultariam em `java.lang.Exception: n ou p deveria ser não negativo`.

Complete a função power na classe MyCalculator e retorne o resultado apropriado após a operação power ou uma exceção apropriada conforme detalhado acima.


## Formato de entrada
Cada linha da entrada contém dois inteiros, n e p.
O código stub bloqueado no editor lê a entrada e envia os valores para o método como parâmetros.


## Restrições
- $$-10 <= n <= 10$$
- $$-10 <= p <= 10$$


## Formato de saída

Cada linha da saída contém o resultado $$n^p$$, se n e p forem positivos.
Se n ou p for negativo, a saída contém "n ou p deve ser não negativo".
Se n e p forem zero, a saída contém "n e p não devem ser zero".
Isso é impresso pelo código stub bloqueado no editor.


## Exemplo de entrada 0
```
3 5
2 4
0 0
-1 -2
-1 3
```


## Exemplo de saída 0
```
243
16
java.lang.Exception: n e p não devem ser zero.
java.lang.Exception: n ou p não deve ser negativo.
java.lang.Exception: n ou p não deve ser negativo.
```


## Explicação 0
- Nos dois primeiros casos, tanto n como p são positivos. Portanto, a função potência retorna a resposta corretamente.
- No terceiro caso, n e p são zero. Portanto, a exceção "n e p não deve ser zero." é impressa.
- Nos dois últimos casos, pelo menos um de n ep é negativo. Portanto, a exceção “n ou p não deve ser negativo.” é impressa para esses dois casos.


## Referências
HackerRank - Java - Exception Handling:
https://www.hackerrank.com/challenges/java-exception-handling/problem