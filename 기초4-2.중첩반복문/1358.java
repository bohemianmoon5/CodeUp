﻿import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int l = (n+1)/2;
	    
	    for(int i = 0; i < l; i++) {
	        for(int j = l-i-1; j > 0; j--) {
	            System.out.print(" ");
	        }
	        for(int k = 0; k < i*2+1; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	}

}
