import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int money = sc.nextInt();
	    sc.nextLine();
	    int days = sc.nextInt();
	    sc.nextLine();
	    String[] arr = sc.nextLine().split(" ");
	    float result = money;
	    
	    for(int i = 0; i < days; i++) {
	        result += result*(float)(parse(arr[i])*0.01);
	    }
	    System.out.printf("%.0f\n", result - money);
	    
	    if((result - money) > 0) {
	        System.out.println("good");
	    }else if((result - money) == 0) {
	        System.out.println("same");
	    }else {
	        System.out.println("bad");
	    }

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
