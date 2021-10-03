import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    int[] nums = new int[24];
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    sc.nextLine();
	    String[] str = sc.nextLine().split(" ");
	    
	    for(int i = 0; i < n; i++) {
	        nums[parse(str[i])] += 1;
	    }

        for(int i = 1; i <= 23; i++) {
            System.out.printf("%d ", nums[i]);
        }
	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
