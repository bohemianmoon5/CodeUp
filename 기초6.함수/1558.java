import java.util.Scanner;

public class Main {
    
    static Long l;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    l = sc.nextLong();
	    System.out.printf("%d", f(l));

	}
	static Long f(Long l) {
	    Long result = (long) 0;
	    
	    while(l != 0) {
	        result = result * 10 + l % 10;
	        l /= 10;
	    }
	    
	    return result;
	}

}
