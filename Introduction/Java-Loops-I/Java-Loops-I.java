/*
    Author: Leonardo Simoes
    Date: 07/02/2023
    HackerRank - Java - Introduction - Java Loops I
    Language: Java 8
*/

import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for(int i = 1; i<= 10; ++i){
            System.out.println(Integer.toString(N) + " x " + Integer.toString(i) + " = " + Integer.toString(i*N));
        }

    }
}