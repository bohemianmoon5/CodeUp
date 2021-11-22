import java.util.Scanner;

public class Main {
    
    static boolean[] a;
    static int f, e;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    a = new boolean[5001];
	    
	    f = sc.nextInt();
	    e = sc.nextInt();
	    
	    for(int i = 1; i <= 5000; i++) {
	        int index = self(i);
	        if(index <= e) {
	            a[index] = true;
	        }
	    }
	    
	    int result = 0;
	    
	    for(int i = f; i <= e; i++) {
	        if(!a[i]) {
	            result += i;
	        }
	    }
	    
	    System.out.printf("%d", result);

	}
	static int self(int n) {
	    int sum = n;
	    while(true) {
	        if(n == 0) {
	            break;
	        }
	        sum += n % 10;
	        n = n / 10;
	    }
	    return sum;
	}

}
