﻿import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[][] a = new int[n][n];
	    int k = 1;
	    
	    for(int i = 0; i < n; i++) {
	        if(i%2 != 0) {
	            for(int j = 0; j < n; j++) {
	                a[j][i] = k++;
	            }
	        }else {
	            for(int j = n-1; j > -1; j--) {
	                a[j][i] = k++;
	            }
	        }
	    }
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
