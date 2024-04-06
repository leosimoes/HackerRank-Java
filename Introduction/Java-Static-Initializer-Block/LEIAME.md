# HackerRank - Java - Introduction - Java Static Initializer Block

Blocos de inicialização estáticos são executados quando a classe é carregada,
e você pode inicializar variáveis estáticas nesses blocos.

É hora de testar seu conhecimento sobre blocos de inicialização estáticos. Você pode ler sobre isso aqui.

Você recebe uma classe Solution com um método principal.

Complete o código fornecido para que ele produza a área de um paralelogramo com largura B e altura H.

Você deve ler as variáveis da entrada padrão.

Se $$B<=0$$ ou $$H<=0$$, a saída deverá ser "java.lang.Exception: largura e altura devem ser positivas" sem aspas.


## Formato de entrada

Existem duas linhas de entrada.
- A primeira linha contém B: a largura do paralelogramo.
- A próxima linha contém H: a altura do paralelogramo.


## Restrições
$$100 <= B <= 100$$

$$100 <= H <= 100$$


## Formato de saída

Se ambos os valores forem maiores que zero, o método principal deverá gerar a área do paralelogramo.
Caso contrário, imprima "java.lang.Exception: largura e altura devem ser positivas" sem aspas.


## Exemplo de entrada 1
```
1
3
```


## Exemplo de saída 1
`3`


## Exemplo de entrada 2
```
-1
2
```


## Exemplo de saída 2
`java.lang.Exception: largura e altura devem ser positivas`


## Referências
HackerRank - Java - Java Static Initializer Block:
https://www.hackerrank.com/challenges/java-static-initializer-block/problem