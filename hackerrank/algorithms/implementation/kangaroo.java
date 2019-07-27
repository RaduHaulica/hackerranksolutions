import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int min(int a, int b) {
        return (a>b?b:a);
    }
    
    public static int max(int a, int b) {
        return (a>b?a:b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String answer = "NO";
        int d1 = x1, d2 = x2, distance = Math.abs(x1 - x2);
        while (true) {
            d1 += v1;
            d2 += v2;
            if (d1 == d2) answer = "YES";
            if (distance <= Math.abs(d1-d2)) break;
            distance = Math.abs(d1-d2);
        }

        System.out.println(answer);
    }
}