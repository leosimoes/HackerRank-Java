# HackerRank - Java - Advanced - Factory Pattern

Segundo a Wikipedia, uma fábrica é simplesmente um objeto que retorna outro objeto de alguma outra chamada de método,
que é considerado "novo".

Neste problema, você recebe uma interface Food.
Existem duas classes `Pizza` e `Cake` que implementam a `Food interface`, e ambas contêm um método `getType()`.

A função principal na classe Main cria uma instância da classe FoodFactory.
A classe FoodFactory contém um método `getFood(String)` que retorna uma nova instância de `Pizza` ou `Cake`
de acordo com seu parâmetro.

Você recebe o código parcialmente concluído no editor.
Por favor, complete a classe FoodFactory.


## Exemplo de entrada 1
```cake```


## Exemplo de saída 1
```
The factory returned class Cake
Someone ordered a Dessert!
```


## Exemplo de entrada 2
```
pizza
```


## Exemplo de saída 2
```
The factory returned class Pizza
Someone ordered Fast Food!
```


## Referências
HackerRank - Java - Factory Pattern:
https://www.hackerrank.com/challenges/java-factory/problem