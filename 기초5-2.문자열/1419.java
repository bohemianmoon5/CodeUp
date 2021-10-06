import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    int check = 0;
	    int index = s.indexOf("love");
	    
	    while(index != -1) {
	        check++;
	        index = s.indexOf("love", index + 4);
	    }
	    System.out.print(check);

	}

}
