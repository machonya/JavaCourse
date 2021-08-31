package com.company.lesson6;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.System.out;

public class ReadFileLine {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("/Users/mihas/Desktop/text_lesson.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            StringTokenizer str = new StringTokenizer(line, ".!?");
            String st;
            File file1 = new File("newFile.txt");
            PrintWriter pw = new PrintWriter(file1);
            while (str.hasMoreTokens()) {
                st = str.nextToken();
                if (isPalindrome(st)){
                    pw.println(st);}
                if (!wordNumbers(st)) {
                    pw.println(st);
                }
            }
            pw.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean wordNumbers(String strn) {
        boolean isTrue = false;
        int count = 1;
        for (int i = 0; i < strn.length(); i++) {
            if (strn.charAt(i) == ' ') {
                count++;
                if (count >= 3 && count <= 7) {
                    isTrue = true;
                } else {
                    isTrue = false;
                }
            }
        }
        return isTrue;
    }
    public static boolean isPalindrome(String strn){
        String[] str = strn.split("\\W+");
        for (String st : str) {
            if (st.equals(reversString(st))){
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
    public  static String reversString(String str){
        if (str.length() == 0){
            return "";
        }
        return str.substring(str.length() - 1) + reversString(str.substring(0, str.length() -1));
    }

}
