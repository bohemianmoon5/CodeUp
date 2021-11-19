import java.util.Scanner;

public class Main {
    
    static int a;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    a = sc.nextInt();
	    
	    System.out.printf("%d", myabs(a));

	}
	static int myabs(int a) {
	    return Math.abs(a);
	}

}
