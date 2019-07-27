import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] numere) {
        int numarul=numere[numere.length-1];
        for (int i=numere.length-2;i>=0;i--) {
            if (numarul >= numere[i]) {
                numere[i+1] = numarul;
                printArray(numere);
                break;
            }
            numere[i+1] = numere[i];
            printArray(numere);
        }
        if (numarul < numere[0]) {
            numere[0] = numarul;
            printArray(numere);
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
         //printArray(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}