﻿import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int cnt = 1;
	    
	    for(int i = 2; i <= n; i++) {
	        if(i%10 == 1) {
	            cnt++;
	        }
	    }
	    System.out.println(cnt);

	}

}
