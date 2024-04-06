/*
    Author: Leonardo Simoes
    Date: 04/04/2024
    HackerRank - Java - Introduction - Java Loops II
    Language: Java 8
*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;++i){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String s = "";
            int sn = a;
            for(int q=0; q<n; ++q){
                sn += Math.pow(2, q) * b;
                s += String.valueOf(sn) + " ";
            }
            System.out.println(s.trim());
        }
        in.close();
    }
}