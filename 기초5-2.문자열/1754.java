import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String[] str = sc.nextLine().split(" ");
	    
	    if(str[0].length() > str[1].length()) {
	        System.out.printf("%s %s", str[1], str[0]);
	    }else if(str[0].length() < str[1].length()) {
	        System.out.printf("%s %s", str[0], str[1]);
	    }else {
	        for(int i = 0; i < str[0].length(); i++) {
	            if(str[1].charAt(i) > str[0].charAt(i)) {
	                System.out.printf("%s %s", str[0], str[1]);
	                break;
	            }else if(str[1].charAt(i) < str[0].charAt(i)) {
	                System.out.printf("%s %s", str[1], str[0]);
	                break;
	            }
	        }
	    }
 
	}

}
