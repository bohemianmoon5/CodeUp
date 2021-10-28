import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[][] a = new int[101][101];
	    int v = 1;
	    int t = 1;
	    
	    for(int i = n; i >= 1; i--) {
	        if(t == 1) {
	            int x = n;
	            for(int j = n-i+1; j <= n; j++) {
	                a[x--][j] = v++;
	            }
	            t = -1;
	        }else {
	            int x = n-i+1;
	            for(int j = n; j >= n-i+1; j--) {
	                a[x++][j] = v++;
	            }
	            t = 1;
	        }
	    }
	    
	    for(int i = 1; i <= n; i++) {
	        for(int j = 1; j <= n; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
