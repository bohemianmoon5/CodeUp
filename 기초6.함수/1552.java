import java.util.Scanner;

public class Main {
    
    static Double d;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    d = sc.nextDouble();
	    System.out.printf("%.14f", f(d));

	}
	static Double f(Double d) {
	    return d - Math.floor(d);
	}

}
