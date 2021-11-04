import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] map = new int[101][101];
	    
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    for(int i = 1; i <= n; i++) {
	        for(int j = 1; j <= m; j++) {
	            map[i][j] = sc.nextInt();
	        }
	    }
	    
	    int sum = 0;
	    int t = 0;
	    
	    for(int i = 1; i <= n-y+1; i++) {
	        for(int j = 1; j <= m-x+1; j++) {
	            for(int k = 0; k < y; k++) {
	                for(int d = 0; d < x; d++) {
	                    sum += map[i+k][j+d];
	                }
	            }
	            if(sum > t) {
	                t = sum;
	            }
	            sum = 0;
	        }
	    }
	    System.out.println(t);

	}

}
