import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    System.out.println(f(n));

	}
	static int f(int n) {
	    int cnt = 0;
	    for(int i = 1; i <= n; i++) {
	        if(n%i == 0) {
	            cnt++;
	        }
	    }
	    return cnt;
	}

}
