/*
    Author: Leonardo Simoes
    Date: 07/03/2023
    HackerRank - Java - Introduction - Java End-of-file
    Language: Java 8
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List linhas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            linhas.add(sc.nextLine());
        }
        sc.close();

        for(int i=0; i < linhas.size(); ++i){
            System.out.println(String.valueOf(i+1) + " " + linhas.get(i));
        }

    }
}