package org.example.days30CodeChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binaryConversion {

    public static void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int count=0;
        int result=-1;
        char[] binVal=Integer.toBinaryString(n).toCharArray();
        for (char c:binVal){
            if(c=='1'){
                count++;
                if(count>result){
                    result=count;
                }
            }else {
                count=0;
            }
        }
        System.out.println(result);
        bufferedReader.close();
    }
}
