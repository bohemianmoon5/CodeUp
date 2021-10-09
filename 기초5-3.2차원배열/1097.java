import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] a = new int[20][20];
	    
	    for(int i = 1; i <= 19; i++) {
	        for(int j = 1; j <= 19; j++) {
	            a[i][j] = sc.nextInt();
	        }
	    }
	    int n = sc.nextInt();
	    
	    for(int i = 0; i < n; i++) {
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        for(int j = 1; j <= 19; j++){
	            if(a[x][j] == 0) {
	                a[x][j] = 1;
	            }else {
	                a[x][j] = 0; 
	            }
	        }
	        for(int j = 1; j <= 19; j++){
	            if(a[j][y] == 0) {
	                a[j][y] = 1;
	            }else {
	                a[j][y] = 0; 
	            }
	        }
	    }
	    
        for(int i = 1; i <= 19; i++) {
            for(int j = 1; j <= 19; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
	    }
	    
	}

}
