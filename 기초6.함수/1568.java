import java.util.Scanner;

public class Main {
    
    static int n, a, b;
    static int[] d;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    d = new int[1010];
	    
	    for(int i = 1; i <= n; i++) {
	        d[i] = sc.nextInt();
	    }
	    
	    a = sc.nextInt();
	    b = sc.nextInt();
	    
	    System.out.printf("%d", maxi(a, b));

	}
	static int maxi(int a, int b) {
	    int result = a;
	    int standard = d[a];
	    for(int i = a; i <= b; i++) {
	        if(d[i] > standard) {
	            result = i;
	            standard = d[i];
	        }
	    }
	    return result;
	}

}
