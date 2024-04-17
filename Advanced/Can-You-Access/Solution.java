/*
    Author: Leonardo Simoes
    Date: 04/17/2024
    HackerRank - Java - Advanced - Can You Access?
    Language: Java 15
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.close();
            Object o = new Inner().new Private();
            String msg = String.valueOf(num) + " is " + ((Inner.Private) o).powerof2(num);
            System.out.println(msg);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        } catch(Exception e){
            System.out.println("Error");
        }
    }

    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }
}