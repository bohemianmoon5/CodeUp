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
	    if(n%2 == 0) {
	        s = "even";
	    }else {
	        s = "odd";
	    }
	    System.out.println(s);
	}

}
