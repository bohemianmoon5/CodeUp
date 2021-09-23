import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int year = sc.nextInt();
	    int month = sc.nextInt();
	    
	    int[] lastD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    int[] lastDLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    
	    if(year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
	        System.out.println(lastDLeap[month-1]);
	    }else {
	        System.out.println(lastD[month-1]);
	    }

	}

}
