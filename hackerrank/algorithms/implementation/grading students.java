import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] grades){
        int[] note = new int[grades.length];
        for (int i=0; i<grades.length; i++) {
            note[i] = round(grades[i]);
            System.out.println(note[i]);
        }
        return note[0];
    }
    
    static int round(int grade) {
        if (grade < 38) return grade;
        int dif = (grade/5+1)*5-grade;
        if (dif < 3) return grade + dif;
        return grade;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int result = solve(grades);
        //System.out.println(result);
    }
}