import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String[] str = sc.nextLine().split(" ");
	    int n = sc.nextInt();
	    
	    System.out.print(parse(str[n-1]));

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
