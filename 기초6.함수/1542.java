import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    f(n);
	    
	}
	static void f(int n) {
	    
	    String s = "";
	    int temp = 0;
	    
	    for(int i = 1; i <= n; i++) {
	        if(n%i == 0) {
	            temp++;
	        }
	    }
	    
	    if(temp == 2) {
	        s = "prime";
	    }else {
	        s = "composite";
	    }
	    
	    System.out.println(s);
	}

}
