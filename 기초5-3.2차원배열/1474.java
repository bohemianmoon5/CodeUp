import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    int k = 1;
	    int t = 1;
	    
	    for(int i = m-1; i > -1; i--) {
	        if(t%2 == 0) {
	            for(int j = 0; j < n; j++) {
	                a[j][i] = k++;
	            }
	        }else {
	            for(int j = n-1; j > -1; j--) {
	                a[j][i] = k++;
	            }
	        }
	        t++;
	    }
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < m; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
