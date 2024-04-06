# HackerRank - Java - Introduction - Java Loops II

Usamos os inteiros, e para criar a seguinte série:

$$(a + 2^0\cdot b), (a + 2^0 * b + 2^1 \cdot b), (a + 2^0 \cdot b + 2^1 \cdot b + .. + 2^{n-1} \cdot b)$$

Você recebe q consultas na forma de a, b e n. Para cada consulta, imprima a série correspondente aos valores a, b e n fornecidos como uma única linha de números inteiros separados por espaço.


## Formato de entrada

A primeira linha contém um número inteiro, denotando o número de consultas.
Cada linha i das q linhas subsequentes contém três números inteiros separados por espaço que descrevem os respectivos valores a, b e n para essa consulta.


## Restrições
$$0 \leqslant q \leqslant 500$$

$$0 \leqslant a,b \leqslant 50$$

$$1 \leqslant n \leqslant 15$$


## Formato de saída

Para cada consulta, imprima a série correspondente em uma nova linha. Cada série deve ser impressa em ordem como uma única linha de n inteiros separados por espaço.


## Exemplo de entrada
```
2
0 2 10
5 3 5
```


## Exemplo de saída
```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```


## Explicação

Temos duas dúvidas:

Usamos a=0, b=2 e n=10 para produzir algumas séries $$s_0, s_1, .., s_{n-1}$$:

$$s_0 = 0 + 1\cdot2 = 2$$

$$s_1 = 0 + 1\cponto2 + 2\cdot2 =6$$

$$s_2 = 0 + 1\cdot2 + 2\cdot2 + 4\cdot2= 14$$

... e assim por diante.

Assim que atingirmos, imprimimos os primeiros dez termos como uma única linha de números inteiros separados por espaço.

Usamos a=5, b=2 e n=10 para produzir algumas séries $$s_0, s_1, .., s_{n-1}$$:

$$s_0 = 5 + 1\cdot3 = 8$$

$$s_1 = 5 + 1\cponto3 + 2\cdot3 =14$$

$$s_2 = 5 + 1\cdot3 + 2\cdot3 + 4\cdot3= 26$$

$$s_3 = 5 + 1\cdot3 + 2\cdot3 + 4\cdot3 + 8\cdot3= 50$$

$$s_4 = 5 + 1\cdot3 + 2\cdot3 + 4\cdot3 + 8\cdot3 + 16\cdot3= 98$$


Em seguida, imprimimos cada elemento de nossa série como uma única linha de valores separados por espaço.


## Referências
HackerRank - Java - Java Loops II:
https://www.hackerrank.com/challenges/java-loops/problem