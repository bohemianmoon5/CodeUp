import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    
	    int k = 1;
	    int t = 1;
	    
	    for(int i = 1; i <= n+m; i++) {
	        
	        int temp_i = i;
	        
	        if(temp_i > n) {
	            temp_i = n;
	            t++;
	        }
	        
	        int temp_j = t;
	        
	        while(temp_i > 0) {
	            if(i+1 == temp_i + temp_j) {
	                a[temp_i][temp_j] = k;
	                k++;
	            }
	            
	            temp_i--;
	            temp_j++;
	        
	            if(temp_j > m) {
	                break;
	            }
	        }
	    }
	    
	    for(int i = n; i > 0; i--) {
	        for(int j = 1; j <= m; j++) {
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println();
	    }

	}

}
