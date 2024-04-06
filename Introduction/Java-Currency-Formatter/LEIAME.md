# HackerRank - Java - Introduction - Java Currency Formatter

Dado um número de precisão dupla, payment , denotando uma quantia em dinheiro, use getCurrencyInstance da classe
NumberFormat método para converter o pagamento nos formatos de moeda dos EUA, Índia, China e França.

Em seguida, imprima os valores formatados da seguinte forma:
```
EUA: formatadoPayment
Índia: formatadoPayment
China: formatadoPagamento
França: formatadoPagamento
```
onde formattedPayment é o pagamento formatado de acordo com a moeda do local apropriado.

Nota: A Índia não possui um Locale integrado, portanto você deve construir um onde o idioma seja en (ou seja, inglês).


## Formato de entrada
Um único número de precisão dupla que indica pagamento.


## Restrições
$$0 <= pagamento <= 10^9$$

## Formato de saída
- Na primeira linha, imprima US: u onde u é o pagamento formatado para a moeda dos EUA.
- Na segunda linha, imprima India: i onde i é o pagamento formatado para a moeda indiana.
- Na terceira linha, imprima China: c onde c é o pagamento formatado para moeda chinesa.
- Na quarta linha, imprima França: f, onde f é o pagamento formatado para a moeda francesa.


## Exemplo de entrada
`12324.134`


## Exemplo de saída
```
EUA: $ 12.324,13
Índia: Rs 12.324,13
China: ￥12.324,13
França: 12 324,13 €
```


## Explicação
Cada linha contém o valor formatado de acordo com as respectivas moedas dos quatro países.


## Referências
HackerRank - Java - Java Currency Formatter:
https://www.hackerrank.com/challenges/java-currency-formatter/problem