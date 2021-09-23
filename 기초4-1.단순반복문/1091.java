﻿import java.io.*;

public class Main {

	public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
        String[] str = br.readLine().split(" ");
        int firstNum = parse(str[0]);
        int multiple = parse(str[1]);
        int plus = parse(str[2]);
        int select = parse(str[3]);
        long result = firstNum;
        
        for(int i = 1; i < select; i++) {
            result = (result * multiple) + plus;
        }
        System.out.println(result);
        
        }catch(IOException e) {
            e.printStackTrace();
        }
        
	}
	public static int parse(String s) {
	    int i = Integer.parseInt(s);
	    return i;
	}

}
