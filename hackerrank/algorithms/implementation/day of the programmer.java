import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int leap(int year, String calendar) {
        if (calendar == "Julian")
            if (year % 4 == 0) return 1;
        if (calendar == "Gregorian")
            if (((year % 4 == 0)&&(year % 100 != 0))||(year % 400 == 0)) return 1;
        return 0;
    }
    
    static String calendar(int year) {
        if (year<1918) return "Julian";
        if (year>1918) return "Gregorian";
        return "Both";
    }
    
    static String solve(int year){
        int daysUntilSeptember = 31+28+31+30+31+30+31+31+leap(year, calendar(year));
        int day = 256 - daysUntilSeptember;
        if (calendar(year) == "Both") day += 13;
        String result = day+".09."+year;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}