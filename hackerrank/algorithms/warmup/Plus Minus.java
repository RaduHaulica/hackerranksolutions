import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double mici = 0, egale = 0, mari = 0;
        int[] vector = new int[size];
        for (int i=0; i<size; i++) {
            vector[i] = scan.nextInt();
            double aux = ((vector[i]<0)?mici++:(vector[i]>0)?mari++:egale++);
        }
        DecimalFormat formatare = new DecimalFormat("#0.000000");
        System.out.println(formatare.format(mari/size));
        System.out.println(formatare.format(mici/size));
        System.out.println(formatare.format(egale/size));
    }
}