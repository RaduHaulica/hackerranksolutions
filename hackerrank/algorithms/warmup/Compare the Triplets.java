import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        // Write Your Code Here
        int unu = 0, doi = 0;
        int trei = 0;
        trei = ((a0>b0)?1:((a0<b0)?4:0)) + ((a1>b1)?1:((a1<b1)?4:0)) + ((a2>b2)?1:((a2<b2)?4:0));
        System.out.println(trei%4+" "+trei/4);
    }
}