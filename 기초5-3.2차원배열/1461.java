﻿import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    int k = 1;
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            a[i][j] = k++;
	        }
	    }
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = n-1; j > -1; j--) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
