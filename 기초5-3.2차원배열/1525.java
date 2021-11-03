import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] a = new int[30][30];
	    int[][] a2 = new int[30][30];
	    
	    for(int i = 10; i < 20; i++) {
	        for(int j = 10; j < 20; j++) {
	            a[i][j] = sc.nextInt();
	        }
	    }
	    
	    for(int i = 10; i < 20; i++) {
	        for(int j = 10; j < 20; j++) {
	            a2[i][j] = a[i][j];
	        }
	    }
	    
	    int n = sc.nextInt();
	    int[][] p = new int[n][2];
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < 2; j++) {
	            p[i][j] = sc.nextInt();
	        }
	    }
	    
	    for(int i = 10; i < 20; i++) {
	        for(int j = 10; j < 20; j++) {
	            if(a[i][j] >= 1) {
	                a2[i][j] = -2;
	                for(int k = 1; k <= a[i][j]; k++) {
	                    if(a[i+k][j] == -1) {
	                        break;
	                    }else {
	                        a2[i+k][j] = -2;
	                    }
	                }
	                for(int k = 1; k <= a[i][j]; k++) {
	                    if(a[i-k][j] == -1) {
	                        break;
	                    }else {
	                        a2[i-k][j] = -2;
	                    }
	                }
	                for(int k = 1; k <= a[i][j]; k++) {
	                    if(a[i][j+k] == -1) {
	                        break;
	                    }else {
	                        a2[i][j+k] = -2;
	                    }
	                }
	                for(int k = 1; k <= a[i][j]; k++) {
	                    if(a[i][j-k] == -1) {
	                        break;
	                    }else {
	                        a2[i][j-k] = -2;
	                    }
	                }
	            }
	        }
	    }
	    
	    for(int i = 0; i < n; i++) {
	        if(a2[p[i][0]+9][p[i][1]+9] == -2) {
	            
	        }else if(a2[p[i][0]+9][p[i][1]+9] == 0) {
	            a2[p[i][0]+9][p[i][1]+9] = i+1;
	        }
	    }
	    
	    for(int i = 10; i < 20; i++) {
	        for(int j = 10; j < 20; j++) {
	            System.out.printf("%d ", a2[i][j]);
	        }
	        System.out.println();
	    }
	    
	    System.out.println("Character Information");
	    
	    for(int i = 0; i < n; i++) {
	        if(a2[p[i][0]+9][p[i][1]+9] == -2) {
	            System.out.println("player " + (i+1) + " dead");
	        }else if(a2[p[i][0]+9][p[i][1]+9] == i+1) {
	            System.out.println("player " + (i+1) + " survive");
	        }
	    }

	}

}
