import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] a = new int[101][101];
	    int x1, y1, x2, y2;
	    
	    for(int i = 0; i < 4; i++) {
	        x1 = sc.nextInt();
	        y1 = sc.nextInt();
	        x2 = sc.nextInt();
	        y2 = sc.nextInt();
	        
	        for(int j = x1; j < x2; j++) {
	            for(int k = y1; k < y2; k++) {
	                a[j][k] = 1;
	            }
	        }
	    }
	    
	    int result = 0;
	    for(int i = 0; i < 101; i++) {
	        for(int j = 0; j < 101; j++) {
	            if(a[i][j] == 1) {
	                result++;
	            }
	        }
	    }
	    System.out.println(result);

	}

}
