import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String s1 = sc.nextLine();
	    String s2 = sc.nextLine();
	    String s3 = sc.nextLine();
	    
	    if(s1.charAt(s1.length() - 1) == s2.charAt(0) && s2.charAt(s2.length() - 1) == s3.charAt(0) && s3.charAt(s3.length() - 1) == s1.charAt(0)) {
	        System.out.println("good");
	    }else {
	         System.out.println("bad");
	    }
	}

}
