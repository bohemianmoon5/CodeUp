import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[n][m];
	    int k = 1;
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < m; j++) {
	            a[i][j] = k++;
	        }
	    }
	    
	    for(int i = n-1; i > -1; i--) {
	        if(i%2 == 0) {
	            for(int j = 0; j < m; j++) {
	                System.out.printf("%d ", a[i][j]);
	            }
	        }else {
	            for(int j = m-1; j > -1; j--) {
	                System.out.printf("%d ", a[i][j]);
	            }
	        }
	        System.out.println();
	    }

	}

}
