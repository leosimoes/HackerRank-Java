# HackerRank - Java - Advanced - SHA-256

Funções hash criptográficas são operações matemáticas executadas em dados digitais; comparando o hash calculado
(ou seja, a saída produzida pela execução de um algoritmo de hash) para um valor de hash conhecido e esperado,
uma pessoa pode determinar a integridade dos dados.

Por exemplo, calcular o hash de um arquivo baixado e comparar o resultado com um hash publicado anteriormente
O resultado pode mostrar se o download foi modificado ou adulterado.

Além disso, as funções hash criptográficas são extremamente resistentes a colisões; em outras palavras,
deve ser extremamente difícil produzir a mesma saída hash a partir de dois valores de entrada diferentes
usando uma função hash criptográfica.

Secure Hash Algorithm 2 (SHA-2) é um conjunto de funções de hash criptográficas projetadas pela Agência de Segurança 
Nacional (NSA).
Consiste em seis algoritmos de hash idênticos (ou seja, SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224, SHA-512/256)
com um tamanho de resumo variável.

SHA-256 é um algoritmo de hash de 256 bits (32 bytes) que pode calcular um código hash para uma entrada de até 
264 - 1 bits.
Ele passa por 64 rodadas de hash e calcula um código hash que é um número hexadecimal de 64 dígitos.

Dada uma string, s, imprima seu valor de hash SHA-256.


## Formato de entrada
Uma única string alfanumérica denotando s.


## Restrições
- $$6 <= |s| <= 20$$
- String consiste em letras do alfabeto inglês (ou seja, $$[a -zA -Z]$$ e/ou dígitos decimais
  (ou seja, 0 a 9) apenas.


## Formato de saída
Imprima o valor da criptografia SHA-256 de s em uma nova linha.


## Exemplo de entrada 0
```HelloWorld```


## Exemplo de saída 0
```872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4```


## Exemplo de entrada 1
```Javarmi123```


## Exemplo de saída 1
```f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678```


## Referências
HackerRank - Java - SHA-256:
https://www.hackerrank.com/challenges/sha-256/problem