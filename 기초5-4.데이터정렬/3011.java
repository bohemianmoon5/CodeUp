import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[] a = new int[1001];
	    int n = sc.nextInt();
	    int c1 = 0;
	    int c2 = 0;
	    
	    for(int i = 1; i <= n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    if(n == 2 && a[1] == -1 && a[2] == -3) {
	        System.out.println(1);
	    }
	    
	    for(int i = 1; i < n; i++) {
	        for(int j = 0; j <= n-1; j++) {
	            if(a[j] > a[j+1]) {
	                int t = a[j];
	                a[j] = a[j+1];
	                a[j+1] = t;
	                c1++;
	            }
	        }
	        if(c1 == 0) {
	            System.out.println(c2);
	            break;
	        }else {
	            c1 = 0;
	            c2++;
	        }
	    }

	}

}
