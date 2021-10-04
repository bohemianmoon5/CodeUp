import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    sc.nextLine();
	    String[] str = sc.nextLine().split(" ");
	    
	    int cnt = 0;
	    
	    for(int i = 0; i < n; i++) {
	        System.out.println(parse(str[i]));
	    }
	    
	    for(int i = 0; i < n; i++) {
	        System.out.println(parse(str[i]));
	    }

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
