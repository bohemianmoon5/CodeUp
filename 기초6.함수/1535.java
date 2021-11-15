import java.util.Scanner;

public class Main {
    
    static int n;
    static int[] a;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    a = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    System.out.printf("%d", f());
	    
	}
	static int f() {
	    
	    int temp = 0;
	    int result = 0;
	    
	    for(int i = 0; i < n; i++) {
	        if(a[i] > temp) {
	            temp = a[i];
	        }
	    }
	    for(int i = 0; i < n; i++) {
	        if(a[i] == temp) {
	            result = i+1;
	            break;
	        }
	    }
	    
	    return result;
	}

}
