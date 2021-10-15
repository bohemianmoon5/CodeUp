import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[][] a = new int[110][110];
	    
	    int k = 1;
	    int t = 1;
	    
	    for(int j = 1; j <= n+m; j++) {
	        
	        int temp_j = j;
	        
	        if(temp_j > m) {
	            temp_j = m;
	            t++;
	        }
	        
	        int temp_i = t;
	        
	        if(temp_i + temp_j > n+m) {
	            break;
	        }
	        
	        while(temp_j > 0) {
	            if(j+1 == temp_i + temp_j) {
	                a[temp_i][temp_j] = k;
	                k++;
	            }
	            
	            temp_i++;
	            temp_j--;
	        
	            if(temp_i > n) {
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
