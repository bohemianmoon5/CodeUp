import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    int check1 = 0;
	    int check2 = 0;
	    
	    for(int i = 0; i < s.length(); i++) {
	        if(s.charAt(i) == 'c' || s.charAt(i) == 'C') {
	            check1++;
	             if(i < s.length() - 1 && (s.charAt(i+1) == 'c' || s.charAt(i+1) == 'C')) {
	            check2++;
	             } 
	             
	        }
	       
	    }
        System.out.printf("%d\n%d", check1, check2);
        
	}

}
