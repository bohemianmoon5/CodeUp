import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[n+1][m+1];
	    
	    for(int i = 1; i <= n; i++) {
	        for(int j = 1; j <= m; j++) {
	            if(j > 1) {
	                a[i][j] = a[i][j-1] + n;
	            }else {
	                a[i][j] = i;
	            }
	        }
	    }
	    
	    for(int i = 1; i <= n; i++) {
	        for(int j = m; j > 0; j--) {
	            System.out.printf("%d ",  a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
