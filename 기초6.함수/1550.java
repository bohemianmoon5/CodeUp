import java.util.Scanner;

public class Main {
    
    static Double d;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    d = sc.nextDouble();
	    System.out.printf("%.0f", Math.floor(sqrt(d)));

	}
	static Double sqrt(Double d) {
	    return Math.sqrt(d);
	}

}
