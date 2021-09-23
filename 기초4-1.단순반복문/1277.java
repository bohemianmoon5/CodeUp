import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int length = sc.nextInt();
	    sc.nextLine();
	    String[] arr = sc.nextLine().split(" ");
	    
	    if(length == 1) {
	        System.out.printf("%s %s %s", arr[0], arr[0], arr[0]);
	    }else {
	        System.out.printf("%s %s %s", arr[0], arr[length/2], arr[length-1]);
	    }

	}

}
