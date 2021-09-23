import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int sum = 0;
        
        for(int i = 0; i < length; i++) {
            sum += parse(arr[i]);
        }
        System.out.println(sum);

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
