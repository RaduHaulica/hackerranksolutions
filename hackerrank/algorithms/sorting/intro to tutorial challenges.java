import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numar = in.nextInt();
        int n = in.nextInt();
        int[] numere = new int[n];
        for (int i=0; i<n; i++) {
            numere[i] = in.nextInt();
        }
        int loc = -1;
        for (int i=0; i<numere.length; i++) {
            if (numere[i] == numar) {
                loc = i;
                break;
            }
        }
        System.out.println(loc);
    }
}