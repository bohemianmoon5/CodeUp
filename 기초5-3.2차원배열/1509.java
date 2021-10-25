import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] a = new int[11][10];
	    
	    for(int i = 0; i < 11; i++) {
	        for(int j = 0; j < 10; j++) {
	            a[i][j] = sc.nextInt();
	        }
	    }
	    
	    for(int i = 0; i < 10; i++) {
	        if(a[10][i] != 0) {
	            int check = 0;
	            for(int j = 0; j < 10; j++) {
	                if(a[j][i] > 0) {
	                    check = 1;
	                }else if(a[j][i] < 0) {
	                    check = -1;
	                }
	            }
	            if(check == 1) {
	                System.out.printf("%d crash\n", i+1);
	            }else if(check == -1) {
	                System.out.printf("%d fall\n", i+1);
	            }else {
	                System.out.printf("%d safe\n", i+1);
	            }
	        }
	    }

	}

}
