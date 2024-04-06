/*
    Author: Leonardo Simoes
    Date: 04/04/2024
    HackerRank - Java - Introduction - Java Currency Formatter
    Language: Java 8
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        payment = Math.round(payment * 100)/100.00;

        NumberFormat usnum = NumberFormat.getInstance(Locale.US);
        usnum.setMinimumFractionDigits(2);
        usnum.setMaximumFractionDigits(2);

        NumberFormat ennum = NumberFormat.getInstance(Locale.ENGLISH);
        ennum.setMinimumFractionDigits(2);
        ennum.setMaximumFractionDigits(2);

        NumberFormat chnum = NumberFormat.getInstance(Locale.CHINA);
        chnum.setMinimumFractionDigits(2);
        chnum.setMaximumFractionDigits(2);

        NumberFormat frnum = NumberFormat.getInstance(Locale.FRANCE);
        frnum.setMinimumFractionDigits(2);
        frnum.setMaximumFractionDigits(2);

        String us = usnum.format(payment);
        String india = ennum.format(payment);
        String china = chnum.format(payment);
        String france = frnum.format(payment);

        System.out.println("US: $" + us);
        System.out.println("India: Rs." + india);
        System.out.println("China: \uFFE5" + china);
        System.out.println("France: " + france + " \u20ac");
    }
}