import java.util.Scanner;

public class Main {
    
    static int n, k;
    static int[] d;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    d = new int[1010];
	    
	    for(int i = 1; i <= n; i++) {
	        d[i] = sc.nextInt();
	    }
	    
	    k = sc.nextInt();
	    
	    System.out.printf("%d", findi(k));

	}
	static int findi(int k) {
	    int result = -1;
	    for(int i = 1; i <= n; i++) {
	        if(k == d[i]) {
	            result = i;
	            break;
	        }
	    }
	    return result;
	}

}
