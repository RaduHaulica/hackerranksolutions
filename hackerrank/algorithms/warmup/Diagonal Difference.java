import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] numere = new int[size][size];
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                numere[i][j] = input.nextInt();
                //System.out.println(numere[i][j]);
            }
        }
        
        int sumDiag1 = 0, sumDiag2 = 0;
        
        for (int i=0; i<size; i++) {
            sumDiag1 += numere[i][i];
            sumDiag2 += numere[i][size-1-i];
        }
        System.out.println(Math.abs(sumDiag1 - sumDiag2));

    }
}