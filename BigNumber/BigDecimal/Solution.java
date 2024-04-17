/*
    Author: Leonardo Simoes
    Date: 04/10/2024
    HackerRank - Java - BigNumber - BigDecimal
    Language: Java 15
*/
import java.io.*;
import java.util.*;
import javafx.util.Pair;
import java.math.BigDecimal;

public class Solution {

    public static void main(String[] args) {
        String num_str;
        BigDecimal num_bgd;
        List<Pair<String, BigDecimal>> bigDecimals_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; ++i){
            num_str = sc.nextLine();
            num_bgd = new BigDecimal(num_str);
            bigDecimals_list.add(new Pair<>(num_str, num_bgd));
        }
        sc.close();

        // Sorting
        Collections.sort(bigDecimals_list, (p1, p2) -> p2.getValue().compareTo(p1.getValue()));

        // Output
        for (Pair<String, BigDecimal> pair : bigDecimals_list) {
            System.out.println(pair.getKey());
        }

    }
}