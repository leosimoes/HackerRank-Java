/*
    Author: Leonardo Simoes
    Date: 04/08/2024
    HackerRank - Java - BigNumber - BigInteger
    Language: Java 8
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}