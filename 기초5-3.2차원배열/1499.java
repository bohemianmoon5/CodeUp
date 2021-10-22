import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int g = sc.nextInt();
	    int[] a = new int[1001];
	    
	    for(int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i < n; i+=g) {
	        int m = a[i];
	        for(int j = i; j < i+g; j++) {
	            if(j < n) {
	                if(m < a[j]) {
	                    m = a[j];
	                }
	            }
	        }
	        System.out.printf("%d ", m);
	    }

	}

}
