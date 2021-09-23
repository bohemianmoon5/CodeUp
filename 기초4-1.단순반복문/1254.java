import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    char first = sc.next().charAt(0);
	    char last = sc.next().charAt(0);
	    
	    for(int i = first; i <= last; i++) {
	        System.out.printf("%c ", i);
	    }

	}

}
