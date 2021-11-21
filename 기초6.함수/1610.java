import java.util.Scanner;

public class Main {
    
    static String s;
    static int f, e;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    s = sc.nextLine();
	    f = sc.nextInt();
	    e = sc.nextInt();
	    
	    System.out.println(mysubstr(s, f, e));

	}
	static String mysubstr(String s, int f, int e) {
	    return (String) s.subSequence(f, f+e);
	}

}
