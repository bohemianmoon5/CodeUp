import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int cnt = 0;
	    int index = 0;
	    int[] arr = new int[2];
	    
	    for(int i = 2; i < n; i++) {
	        if(n%i == 0) {
	            cnt++;
	            if(i == 2 && index < 2) {
	                arr[index] = i;
	                index++;
	            }else if(i%2 != 0 && index < 2) {
	                arr[index] = i;
	                index++;
	            }
	        }
	    }
	    if(cnt == 2 && index == 2) {
	        System.out.printf("%d %d", arr[0], arr[1]);
	    }else {
	        System.out.println("wrong number");
	    }

	}

}
