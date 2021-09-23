import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int k = sc.nextInt();
	    int h = sc.nextInt();
	    int result = 0;
	    
	    if(k%2 == 0) {
	        result += k * 5;
	    }else if(k == 1) {
	        result += 1;
	    }else {
	        result += k - (((k-1)*5)/10);
	    }
	    
	    if(h%2 == 0) {
	        result += h * 5;
	    }else if(h == 1) {
	        result += 1;
	    }else {
	        result += h - (((h-1)*5)/10);
	    }
	    
	    System.out.println(result);

	}

}
