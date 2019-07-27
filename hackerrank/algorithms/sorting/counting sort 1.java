import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numere = new int[100];
        for (int i=0; i<numere.length; i++) {
            numere[i] = 0;
        }
        for (int i=0; i<n; i++) {
            int numar = in.nextInt();
            numere[numar]++;
        }
        for (int i=0; i<numere.length; i++) {
            System.out.print(numere[i]+" ");
        }
    }
}