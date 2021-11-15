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
	    if(n < 0) {
	        s = "negative";
	    }else if(n == 0){
	        s = "zero";
	    }else {
	        s = "positive";
	    }
	    System.out.println(s);
	}

}
