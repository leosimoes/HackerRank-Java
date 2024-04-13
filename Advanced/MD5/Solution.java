/*
    Author: Leonardo Simoes
    Date: 04/13/2024
    HackerRank - Java - Advanced - MD5
    Language: Java 7
*/

import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            MessageDigest md = MessageDigest.getInstance("MD5");

            String input = sc.nextLine();
            byte[] bytes = md.digest(input.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }

            System.out.println(sb.toString());
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}