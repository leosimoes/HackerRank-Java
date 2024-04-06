# HackerRank - Java - Introduction - Java Loops II

We use the integers , , and  to create the following series:

$$(a + 2^0\cdot b), (a + 2^0 * b + 2^1 \cdot b), (a + 2^0 \cdot b + 2^1 \cdot b + .. + 2^{n-1} \cdot b)$$

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n  values as a single line of  space-separated integers.


## Input Format

The first line contains an integer, , denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.


## Constraints
$$0 \leqslant q \leqslant 500$$

$$0 \leqslant a,b \leqslant 50$$

$$1 \leqslant n \leqslant 15$$


## Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.


## Sample Input
```
2
0 2 10
5 3 5
```


## Sample Output
```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```


## Explanation

We have two queries:

We use a=0, b=2, and n=10 to produce some series  $$s_0, s_1, .., s_{n-1}$$:

$$s_0 = 0 + 1\cdot2 = 2$$

$$s_1 = 0 + 1\cdot2 + 2\cdot2 =6$$

$$s_2 = 0 + 1\cdot2 + 2\cdot2 + 4\cdot2= 14$$

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use a=5, b=2, and n=10 to produce some series $$s_0, s_1, .., s_{n-1}$$:

$$s_0 = 5 + 1\cdot3 = 8$$

$$s_1 = 5 + 1\cdot3 + 2\cdot3 =14$$

$$s_2 = 5 + 1\cdot3 + 2\cdot3 + 4\cdot3= 26$$

$$s_3 = 5 + 1\cdot3 + 2\cdot3 + 4\cdot3 + 8\cdot3= 50$$

$$s_4 = 5 + 1\cdot3 + 2\cdot3 + 4\cdot3 + 8\cdot3 + 16\cdot3= 98$$


We then print each element of our series as a single line of space-separated values.


## References
HackerRank - Java - Java Loops II:
https://www.hackerrank.com/challenges/java-loops/problem