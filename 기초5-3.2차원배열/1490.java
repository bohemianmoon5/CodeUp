import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    
	    int x = n, y = 0, t = 0, k = -1, e = n, f = m; 
	    
	    while(true) {
	        for(int i = 0; i < n; i++) {
	            t++;
	            x += k;
	            a[x][y] = t;
	        }
	        k *= -1;
	        n--;
	        m--;
	        for(int j = 0; j < m; j++) {
	            t++;
	            y += k;
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
