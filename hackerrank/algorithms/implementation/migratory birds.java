import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int max(int[] arr) {
        int max = arr[0], pozitie = 0;
        for (int i = 1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pozitie = i;
            }
        }
        return pozitie+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        int[] contor = {0, 0, 0, 0, 0};
        for (int i : types) {
            contor[i-1]++;
        }
        //for (int i : contor) System.out.println(i);
        System.out.println(max(contor));
    }
}