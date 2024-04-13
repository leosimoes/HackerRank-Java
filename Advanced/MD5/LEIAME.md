# HackerRank - Java - Advanced - MD5

MD5 (algoritmo Message-Digest 5) é uma função hash criptográfica amplamente utilizada
com um valor de hash de 128 bits. Aqui estão alguns usos comuns para MD5:
- Para armazenar um hash unidirecional de uma senha.
- Para fornecer alguma garantia de que um arquivo transferido chegou intacto.

MD5 é um de uma série de algoritmos de resumo de mensagens projetados pelo professor Ronald Rivest do MIT (Rivest, 1994);
no entanto, a segurança do MD5 foi gravemente comprometida, principalmente pelo malware Flame em 2012.
O CMU Software Engineering Institute considera essencialmente o MD5 como "criptograficamente quebrado e inadequado
para uso posterior".

Dada uma string alfanumérica s, denotando uma senha, calcule e imprima seu valor de criptografia MD5.

## Formato de entrada
Uma única string alfanumérica denotando s.


## Restrições
- $$6 <= |s| <= 20$$
- String consiste em letras do alfabeto inglês (ou seja, $$[a -zA -Z]$$ e/ou dígitos decimais
  (ou seja, 0 a 9) apenas.


## Formato de saída
Imprima o valor da criptografia MD5 de s em uma nova linha.


## Exemplo de entrada 0
```HelloWorld```


## Exemplo de saída 0
```68e109f0f40ca72a15e05cc22786f8e6```


## Exemplo de entrada 1
```Javarmi123```


## Exemplo de saída 1
```2da2d1e0ce7b4951a858ed2d547ef485```


## Referências
HackerRank - Java - MD5:
https://www.hackerrank.com/challenges/java-md5/problem