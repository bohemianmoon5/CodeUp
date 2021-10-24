import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[][] a = new int[n][n];
	    int i = 0, j = 0, k = 1, l = 0, c;
	    
	    for(c = n-1; c > 0; l++, c--) {
	        for(i = l, j  = l; j < c; j++) {
	            a[i][j] = k++;
	        }
	        for(i = l; i < c; i++) {
	            a[i][j] = k++;
	        }
	        for(j = c; j > l; j--) {
	            a[i][j] = k++;
	        }
	        for(i = c; i > l; i--) {
	            a[i][j] = k++;
	        }
	    }
	    
	    if(n%2 == 1) {
	        a[n/2][n/2] = k;
	    }
	    
	    for(i = 0; i < n; i++) {
	        for(j = 0; j < n; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
