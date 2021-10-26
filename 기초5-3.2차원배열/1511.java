import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[][] a = new int[101][101];
	    int v = 0;
	    
	    for(int i = 1; i <= n; i++) {
	        for(int j = 1; j <= n; j++) {
	            a[i][j] = ++v;
	        }
	    }
	    
	    int sum = 0;
	    for(int i = 1; i <= n; i++) {
	        for(int j = 1; j <= n; j++) {
	            if(i == 1 || i == n || j == 1 || j == n) {
	                sum += a[i][j];
	            }
	        }
	    }
        System.out.println(sum);
        
	}

}
