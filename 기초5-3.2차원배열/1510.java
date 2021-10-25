import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[][] a = new int[50][50];
	    
	    int center = (n+1)/2;
	    int t = 0;
	    
	    int i = 1;
	    int j = center;
	    
	    for(int d = 0; d < n*n; d++) {
	        a[i][j] = ++t;
	        if(t%n == 0) {
	            i++;
	        }else {
	            i--;
	            j++;
	        }
	        if(i < 1) {
	            i = n;
	        }
	        if(j > n) {
	            j = 1;
	        }
	    }
	    
	    for(i = 1; i <= n; i++) {
	        for(j = 1; j <= n; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
