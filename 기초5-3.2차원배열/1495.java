//시간초과

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] a = new int[1001][1001];
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int k = sc.nextInt();
	    int sum = 0;
	    
	    for(int i = 1; i <= k; i++) {
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        int u = sc.nextInt();
	        
	        a[x1][y1] = a[x1][y1] + u;
	        a[x2+1][y2+1] = a[x2+1][y2+1] + u;
	        
	        a[x1][y2+1] = a[x1][y2+1] - u;
	        a[x2+1][y1] = a[x2+1][y1] - u; 
	    }
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < m; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < m; j++) {
	            sum += a[i][j];
	            a[i][j] = sum;
	        }
	        sum = 0;
	    }
	    
	    sum = 0;
	    
	    for(int j = 0; j < m; j++) {
	        for(int i = 0; i < n; i++) {
	            sum += a[i][j];
	            a[i][j] = sum;
	        }
	        sum = 0;
	    }
	    System.out.println();
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < m; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }
	   
	}

}
