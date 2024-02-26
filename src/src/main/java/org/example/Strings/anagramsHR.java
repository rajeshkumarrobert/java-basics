package org.example.Strings;
import java.util.Scanner;

public class anagramsHR {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()==b.length()){
            a=a.toLowerCase();
            b=b.toLowerCase();
            String[] a_array=a.split("");
            java.util.Arrays.sort(a_array);
            String[] b_array=b.split("");
            java.util.Arrays.sort(b_array);
            for (int i=0;i<a.length()+1;i++){
                if(!a_array[i].equals(b_array[i])){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void anagrams() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first String");
        String a = scan.next();
        System.out.println("Enter the second StringABC");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}