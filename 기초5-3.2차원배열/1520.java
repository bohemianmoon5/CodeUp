import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] arr_a = new int[172][172];
	    int[][] arr_b = new int[172][172];
	    
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    
	    for(int i = 1; i <= a; i++) {
	        for(int j = 1; j <= b; j++) {
	            arr_a[i][j] = sc.nextInt();
	            arr_b[i][j] = 0;
	        }
	    }
	    int k = sc.nextInt();
	    
	    while(k > 0) {
	        for(int i = 1; i <= a; i++) {
	            for(int j = 1; j <= b; j++) {
	                arr_b[i][j] = arr_a[i-1][j-1] + arr_a[i-1][j] + arr_a[i-1][j+1] + arr_a[i][j-1] + arr_a[i][j+1] + arr_a[i+1][j-1] + arr_a[i+1][j] + arr_a[i+1][j+1];
	                if(arr_a[i][j] == 0) {
	                    arr_b[i][j] = arr_b[i][j] == x ? 1 : 0; 
	                }else {
	                    arr_b[i][j] = (y <= arr_b[i][j] && arr_b[i][j] < z) ? 1 : 0;
	                }
	            }
	        }
	        
	        for(int i = 1; i <= a; i++) {
	            for(int j = 1; j <= b; j++) {
	                arr_a[i][j] = arr_b[i][j];
	            }
	        }
	        k--;
	    }
	    
	    for(int i = 1; i <= a; i++) {
	            for(int j = 1; j <= b; j++) {
	                System.out.printf("%d ", arr_b[i][j]);
	            }
	            System.out.println();
	        }
	}

}
