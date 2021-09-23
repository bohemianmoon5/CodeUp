import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int first = sc.nextInt();
	    int last = sc.nextInt();
	    String process = "";
	    int result = 0;
	    
	    for(int i = first; i <= last; i++) {
	        if(i%2 == 0) {
	            result -= i;
	            process += -i;
	        }else {
	            result += i;
	            process += "+" + i;
	        }
	    }
	    System.out.printf("%s=%d", process, result);
	    
	}

}
