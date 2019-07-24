import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max_height = 0, blown = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (height[height_i] > max_height) {
                blown = 1;
                max_height = height[height_i];
            } else if (height[height_i] == max_height) {
                blown++;
            }
        }
        System.out.println(blown);
    }
}