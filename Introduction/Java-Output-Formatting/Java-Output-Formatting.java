/*
    Author: Leonardo Simoes
    Date: 04/05/2024
    HackerRank - Java - Introduction - Java Output Formatting
    Language: Java 8
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String xs = String.valueOf(x);
            if(x<100 && x>=10){
                xs = "0" + xs;
            }else if(x < 10){
                xs = "00" + xs;
            }
            System.out.printf("%-15s%s \n", s1, xs);
        }
        System.out.println("================================");
    }
}