import java.io.*;
import java.util.*;

public class Solution {
    static void printeaza(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    static int[] sort(int[] arr, int start, int end) {
        if (start>=end) return arr;
        int i=0, pivot = arr[end];
        for (int j=start;j<end;j++) {
            if (arr[j]<=pivot) {
                int aux = arr[j];
                arr[j] = arr[start+i];
                arr[start+i] = aux;
                i++;
            }
        }
        //printeaza(arr);
        arr[end] = arr[start+i];
        arr[start+i] = pivot;
        arr = sort(arr, start, start+i-1);
        arr = sort(arr, start+i+1, end);
        //printeaza(arr);
        return arr;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numere = new int[n];
        for (int i=0; i<n; i++) {
            numere[i] = in.nextInt();
        }
        //printeaza(numere);
        numere = sort(numere, 0, numere.length-1);
        
        printeaza(numere);
    }
}