import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    
	    int x = n-1, y = m, t = n*m+1, k = 1, e = n, f = m; 
	    
	    while(true) {
	        k *= -1;
	        for(int i = 0; i < m; i++) {
	            t--;
	            y += k;
	            a[x][y] = t;
	        }
	        n--;
	        m--;
	        for(int j = 0; j < n; j++) {
	            t--;
	            x += k;
	            a[x][y] = t;
	        }
	        if(n <= 0 || m <= 0) {
	            break;
	        }
	    }
	    
	    for(int i = 0; i < e; i++) {
	        for(int j = 0; j < f; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
