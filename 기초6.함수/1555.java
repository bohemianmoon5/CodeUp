import java.util.Scanner;

public class Main {
    
    static Long l;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    l = sc.nextLong();
	    System.out.println(f(l));

	}
	static Long f(Long l) {
	    return (l*(l+1)/2);
	}

}
