import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int rMin = s[0], rMax = s[0], countMin = 0, countMax = 0;
        for (int val : s) {
            if (val < rMin) {
                countMin++;
                rMin = val;
            }
            if (val > rMax) {
                countMax++;
                rMax = val;
            }
        }
        int[] arr = {countMax, countMin};
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}