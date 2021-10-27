import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    int[][] a = new int[101][101];
	    
	    a[x][y] = 1;
	    
	    int v = a[x][y];
	    for(int i = x-1; i >= 1; i--) {
	        a[i][y] = ++v;
	    }
	    
	    v = a[x][y];
	    for(int i = x+1; i <= n; i++) {
	        a[i][y] = ++v;
	    }
	    
	    for(int i = 1; i <= n; i++) {
	        v = a[i][y];
	        for(int j = y-1; j >= 1; j--) {
	            a[i][j] = ++v;
	        }
	        
	        v = a[i][y];
	        for(int j = y+1; j <= n; j++) {
	            a[i][j] = ++v;
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
