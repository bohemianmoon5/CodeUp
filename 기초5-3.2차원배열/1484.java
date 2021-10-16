import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    
	    int x = 0, y = -1, t = 0, k = 1, e = n, f = m;
		
	    while(true) {
		for(int i = 0; i < m; i++) {
		    t += 1;
		    y += k;
		    a[x][y] = t;
		}
		n--;
		m--;
		for(int j = 0; j < n; j++) {
		    t++;
		    x += k;
		    a[x][y] = t;
		}
		k *= -1;
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
