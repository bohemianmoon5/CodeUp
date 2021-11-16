import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    if(prime(n)) {
	        System.out.println("prime");
	    }else {
	        System.out.println("composite");
	    }

	}
	static boolean prime(int n) {
	    int temp = 0;
	    for(int i = 1; i <= n; i++) {
	        if(n%i == 0) {
	            temp++;
	        }
	    }
	    if(temp == 2) {
	        return true;
	    }else {
	        return false;
	    }
	}

}
