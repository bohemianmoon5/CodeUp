import java.util.Scanner;

public class Main {
    
    static Double d;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    d = sc.nextDouble();
	    System.out.printf("%.0f", f(d));

	}
	static Double f(Double d) {
	    if(d < 0 && d > -1) {
	        return -(Math.ceil(d));
	    }else {
	        return Math.ceil(d);
	    }
	}

}
