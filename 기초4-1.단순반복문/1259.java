import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int cnt = 1;
	    int sum = 0;
	    
	    while(cnt <= n) {
	        if(cnt%2 == 0) {
	            sum += cnt;
	        }
	        cnt++;
	    }
	    System.out.println(sum);

	}

}
