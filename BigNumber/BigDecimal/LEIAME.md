# HackerRank - Java - BigNumber - BigDecimal
A classe `BigDecimal` do Java pode lidar com números decimais assinados com precisão arbitrária.
Vamos testar seu conhecimento sobre eles!

Dado um array, `s`, de `n` strings de números reais, classifique-as em ordem decrescente - mas espere, tem mais!

Cada número deve ser impresso exatamente no mesmo formato em que foi lido no stdin,
o que significa que `.1` é impresso como `.1` e `0.1` é impresso como `0.1`.

Se dois números representam valores numericamente equivalentes (por exemplo, `.1===0.1`), 
então eles devem ser listados na mesma ordem que eles foram recebidos como entrada).

Complete o código na seção desbloqueada do editor abaixo.
Você deve reorganizar os elementos do array de acordo com as instruções acima.


## Formato de entrada
A primeira linha consiste em um único inteiro, `n`, denotando o número de strings inteiras.
Cada linha `i` das `n` linhas subsequentes contém um número real denotando o valor de `si`.


## Restrições
- `1<= n <= 200`
- Cada `si` possui no máximo `300` dígitos.


## Formato de saída
O código stub bloqueado no editor imprimirá o conteúdo do array `s` em stdout.
Você é responsável apenas por reordenar os elementos do array.


## Exemplo de entrada
```
9
-100
50
0
56,6
90
0,12
.12
34/02
000.000
```


## Exemplo de saída
```
90
56,6
50
34/02
0,12
.12
0
000.000
-100
```


## Referências
HackerRank - Java - Big:
https://www.hackerrank.com/challenges/java-bigdecimal/problem