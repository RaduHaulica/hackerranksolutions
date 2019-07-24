import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE, sum = 0;
        for (int i=0; i<5; i++) {
            arr[i] = in.nextLong();
            sum += arr[i];
            min = arr[i]<min?arr[i]:min;
            max = arr[i]>max?arr[i]:max;
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}
