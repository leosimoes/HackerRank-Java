/*
    Author: Leonardo Simoes
    Date: 04/10/2024
    HackerRank - Java - Exception Handling - Exception Handling
    Language: Java 8
*/

import java.util.Scanner;
class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    String power(int n, int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        } else if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        return String.valueOf(Math.round(Math.pow(n,p)));
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}