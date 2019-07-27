import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numere = new int[n];
        for (int i=0; i<n; i++) {
            numere[i] = in.nextInt();
        }
        //ArrayList left = new ArrayList(), right = new ArrayList();
        StringBuilder left = new StringBuilder(""), right = new StringBuilder("");
        for (int i=1; i<n; i++) {
            if (numere[i]<numere[0]) left.append(numere[i]+" ");
            if (numere[i]>numere[0]) right.append(numere[i]+" ");
        }
        System.out.println(left+" "+numere[0]+" "+right);
    }
}