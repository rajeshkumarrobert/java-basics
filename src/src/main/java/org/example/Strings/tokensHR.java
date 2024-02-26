package org.example.Strings;

import java.util.Objects;
import java.util.Scanner;

public class tokensHR {

    public static void token() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //alternateSolution(s);
        hrSolution(s);
        scan.close();
    }

    private static void alternateSolution(String s) {
        //s=s.replace(",", "");
        char[] charArray = s.toCharArray();
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<charArray.length;i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }else{
                    sb.append(" ");
            }
        }
        String result = sb.toString();
        String[] result1 = result.split(" ");
        System.out.println(result1.length);
        for (int i=0;i<=result1.length-1;i++){
            System.out.println(result1[i]);
        }

    }

    public static void hrSolution(String s){
        if (s==null || s==" " || s.trim().isEmpty()) {
            System.out.println(0);

        }
        else
        {
            s=s.trim();
            String []s1=s.split("[!,?._ '@]+");

            System.out.println(s1.length);

            for (String string : s1) {
                if (!Objects.equals(string, " ")) {
                    System.out.println(string);
                }

            }
        }
    }

}