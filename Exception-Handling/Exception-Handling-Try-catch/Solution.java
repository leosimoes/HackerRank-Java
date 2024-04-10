/*
    Author: Leonardo Simoes
    Date: 04/10/2024
    HackerRank - Java - Exception Handling - Exception Handling (Try-catch)
    Language: Java 8
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            sc.nextLine();
            int y = sc.nextInt();
            //sc.nextLine();
            System.out.println(x/y);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }finally{
            sc.close();
        }
    }
}