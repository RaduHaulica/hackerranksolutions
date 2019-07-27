import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int min(int[] numere) {
        int min = numere[0];
        for (int i=1; i<numere.length; i++) {
            if (numere[i] < min) {
                min = numere[i];
            }
        }
        return min;
    }

    public static int max(int[] numere) {
        int max = numere[0];
        for (int i=1; i<numere.length; i++) {
            if (numere[i] > max) {
                max = numere[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int min = min(b), max = max(a), contor =0;
        for (int i=max; i<=min; i++) {
            int aok=1, bok=1;
            for (int j=0; j<a.length; j++) {
                if (i%a[j] != 0) aok=0;
            }
            for (int j=0; j<b.length; j++) {
                if (b[j]%i != 0) bok=0;
            }
            if ((aok == 1)&&(bok == 1)) {
                contor++;
            }
        }
        System.out.println(contor);
    }
}