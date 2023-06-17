/*
    Author: Leonardo Simoes
    Date: 06/17/2023
    HackerRank - Java - Introduction - Java Stdin and Stdout II
    Language: Java 8
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}