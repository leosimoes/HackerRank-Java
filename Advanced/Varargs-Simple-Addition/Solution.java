/*
    Author: Leonardo Simoes
    Date: 04/14/2024
    HackerRank - Java - Advanced - Varargs Simple Addition
    Language: Java 15
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList();
        for(int i =0; i<6; ++i){
            nums.add(sc.nextInt());
            //sc.next();
        }
        sc.close();
        int sum_result = nums.get(0);
        String sum_str = String.valueOf(nums.get(0));
        String result_str = "";
        for(int i=0; i<5; ++i){
            sum_result += nums.get(i+1);
            sum_str += "+" + String.valueOf(nums.get(i+1));
            result_str = sum_str + "=" + String.valueOf(sum_result);
            if(i!=2){
                System.out.println(result_str);
            }
        }
    }
}