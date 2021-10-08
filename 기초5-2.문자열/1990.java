import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    char[] c = s.toCharArray();
	    int sum = 0;
	    
	    for(int i = 0; i < c.length; i++) {
	        sum += (c[i] - 48);
	    }
	    
	    if(sum % 3 == 0) {
	        System.out.println(1);
	    }else {
	        System.out.println(0);
	    }

	}

}
