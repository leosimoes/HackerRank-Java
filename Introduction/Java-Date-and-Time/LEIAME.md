# HackerRank - Java - Introduction - Java Date and Time 
A classe Calendar é uma classe abstrata que fornece métodos para conversão entre um instante específico no tempo e
um conjunto de campos de calendário como ANO, MÊS, DIA_DE_MÊS, HORA e assim por diante, e para manipular os campos de 
calendário, como obter a data da próxima semana.

Você recebe uma data. Você só precisa escrever o método , que retorna o dia daquela data.
Para simplificar sua tarefa, fornecemos uma parte do código no editor.


## Exemplo
```
mês = 8
dia = 14
ano = 2017
```
O método deve retornar SEGUNDA-FEIRA como o dia dessa data.


## Descrição da função
Complete a função findDay no editor abaixo.

findDay tem os seguintes parâmetros:
- int: mês
  -int: dia
  -int: ano
  Retorna:
- string: o dia da semana em letras maiúsculas


## Formato de entrada

Uma única linha de entrada contendo mês, dia e ano separados por espaço, respectivamente, no formato MM DD AAAA.

## Restrições
$$200<ano<3000$$


## Exemplo de entrada
`08 05 2015`


## Exemplo de saída
`QUARTA-FEIRA`


## Explicação
O dia 5 de agosto de 2015 foi `QUARTA-FEIRA`.

## Referências
HackerRank - Java - Java Date and Time:
https://www.hackerrank.com/challenges/java-date-and-time/problem