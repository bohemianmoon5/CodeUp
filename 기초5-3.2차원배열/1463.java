import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    
	    for(int i = 1; i <= n; i++) {
	        for(int j = 1; j <= n; j++) {
	            if(j > 1) {
	                a[i][j] = a[i][j-1] + n;
	            }else {
	                a[i][j] = i;
	            }
	        }
	    }
	    
	    for(int i = n; i > 0; i--) {
	        for(int j = 1; j <= n; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
