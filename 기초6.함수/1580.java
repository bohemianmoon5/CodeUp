import java.util.Scanner;

public class Main {
    
    static int r;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    r = sc.nextInt();
	    
	    System.out.printf("%.2f", circle(r));

	}
	static Double circle(int r) {
	    return r*r*3.14;
	}

}
