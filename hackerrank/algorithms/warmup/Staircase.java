import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for (int i=1; i<=size; i++) {
            for (int j=1; j<=size; j++) {
                if (j<=size-i) {
                    System.out.print(" ");                    
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}