# HackerRank - Java - Introduction - Java Output Formatting

A função `System.out.printf` do Java pode ser usada para imprimir a saída formatada.
O objetivo deste exercício é testar sua compreensão da formatação de saída usando printf.

Para começar, uma parte da solução é fornecida no editor;
você deve formatar e imprimir a entrada para concluir a solução.


## Formato de entrada

Cada linha de entrada conterá uma String seguida por um número inteiro.
Cada String terá no máximo 10 caracteres alfabéticos,
e cada número inteiro estará no intervalo inclusivo de 0 a 999.


## Formato de saída

Em cada linha de saída deve haver duas colunas:
A primeira coluna contém a String e é justificada à esquerda usando exatamente 15 caracteres.
A segunda coluna contém o número inteiro, expresso em exatamente 3 dígitos; se a entrada original tiver menos de 
três dígitos, você deve preencher os dígitos iniciais da sua saída com zeros.


## Exemplo de entrada
```
Java 100
cp 65
píton 50
```


## Exemplo de saída
```
===============================
Java 100
cpp 065
píton 050
===============================
```


## Explicação
Cada String é justificada à esquerda com espaços em branco nos primeiros 15 caracteres.
O dígito inicial do número inteiro é o caractere 16°, e cada número inteiro com menos de 3 dígitos agora possui zeros à esquerda.


## Referências
HackerRank - Java - Java Output Formatting:
https://www.hackerrank.com/challenges/java-output-formatting/problem