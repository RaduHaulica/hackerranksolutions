import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        long suma = 0L;
        for (int i=0; i<size; i++) {
            numbers[i] = scan.nextInt();
            suma += numbers[i];
        }
        System.out.println(suma);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}