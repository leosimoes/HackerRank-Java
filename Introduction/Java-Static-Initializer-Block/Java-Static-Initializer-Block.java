/*
    Author: Leonardo Simoes
    Date: 04/05/2024
    HackerRank - Java - Introduction - Java-Static-Initializer-Block
    Language: Java 8
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int B = in.nextInt();
        int H = in.nextInt();
        in.close();
        if(B>0 && H>0){
            System.out.println(B*H);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}