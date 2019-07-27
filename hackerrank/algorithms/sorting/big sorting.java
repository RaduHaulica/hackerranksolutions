import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static Comparator<String> StringIntComparator = new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            return compareStringsInt(a, b);
        }
    };
    
    static int compareStringsInt(String a, String b) {
        // -1 a<b, 0 =, 1 a>b
        if (a.length() < b.length()) return -1;
        if (a.length() > b.length()) return 1;
        for (int i=0; i<a.length(); i++) {
            if ((int)a.charAt(i) > (int)b.charAt(i)) return 1;
            else if ((int)a.charAt(i) < (int)b.charAt(i)) return -1;
        }
        return 0;
    }
    
    static String[] sort(String[] numere) {
        for (int i=0; i<numere.length; i++) {
            for (int j=i; j<numere.length; j++) {
                if (compareStringsInt(numere[i],numere[j]) == -1) {
                    String aux = numere[i];
                    numere[i]=numere[j];
                    numere[j]=aux;
                }
            }
        }
        return numere;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        String[] sorted = unsorted;
        Arrays.sort(unsorted, StringIntComparator);
        StringBuilder out = new StringBuilder("");
        for (String i : sorted) {
            out.append(i+"\n");
        }
        System.out.println(out);
    }
}