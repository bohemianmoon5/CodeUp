import java.util.Scanner;

public class Main {
    
    static Long l;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    l = sc.nextLong();
	    System.out.printf("%d", abs(l));

	}
	static Long abs(Long l) {
	    if(l < 0) {
	        return -l;
	    }else {
	        return l;
	    }
	}

}
