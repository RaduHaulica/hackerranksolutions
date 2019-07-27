import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // setup
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        int sumPrices = 0;
        for (int i=0; i<n; i++) {
            prices[i] = in.nextInt();
            if (i != k) sumPrices += prices[i];
        }
        int charged = in.nextInt();
        // solution
        if (sumPrices/2 == charged) System.out.println("Bon Appetit");
        else System.out.println(charged - sumPrices/2);
    }
}