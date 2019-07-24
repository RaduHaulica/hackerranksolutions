import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
/*
        int offset = text.lastIndexOf("PM")!=-1?12:0;
        if (text.length() > 8) text = text.substring(0, 8);
        String[] textArr = text.split(":");
        if (offset != 0) {
            textArr[0] = Integer.toString(Integer.parseInt(textArr[0])+offset);
        } else {
            if (Integer.parseInt(textArr[0]) == 12) textArr[0] = "00";
        }
        if (Integer.parseInt(textArr[0]) == 24) textArr[0] = "12";
        text = String.join(":", textArr);
        System.out.println(text);
*/
        try {
            DateFormat df = new SimpleDateFormat("hh:mm:ssa");
            DateFormat out = new SimpleDateFormat("HH:mm:ss");
            Date date = df.parse(text);
            System.out.println(out.format(date));
        } catch(ParseException e) {
            e.printStackTrace();
        }
    }        
}