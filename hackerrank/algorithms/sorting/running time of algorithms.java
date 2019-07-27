import java.io.*;
import java.util.*;

public class Solution {
    
    static int insertSortCount(int[] arr) {
        int count = 0;
        for (int i=1; i<arr.length; i++) {
            int numar = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>numar) {
                arr[j+1] = arr[j];
                j--;
                count++;
            }
            arr[j+1] = numar;
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numere = new int[n];
        for (int i=0; i<n; i++) {
            numere[i] = in.nextInt();
        }
        int result = insertSortCount(numere);
        System.out.println(result);
    }
}