import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[n][m];
	    int[][] b = new int[n][m];
	    
	    int sum = 0;
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < m; j++) {
	            a[i][j] = sc.nextInt();
	            for(int k = 0; k <= i; k++) {
	                for(int d = 0; d <= j; d++) {
	                    sum += a[k][d];
	                }
	            }
	            b[i][j] = sum;
	            sum = 0;
	        }
	    }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }
	}

}
