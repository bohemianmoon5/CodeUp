import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    System.out.println(grade(n));

	}
	static char grade(int n) {
	    if(n <= 100 && n >= 90) {
	        return 'A';
	    }else if(n < 90 && n >= 80) {
	        return 'B';
	    }else if(n < 80 && n >= 70) {
	        return 'C';
	    }else if(n < 70 && n >= 60) {
	        return 'D';
	    }else if(n < 60) {
	        return 'F';
	    }
	    return 0;
	}

}
