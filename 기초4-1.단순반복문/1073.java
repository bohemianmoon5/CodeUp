import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String nums = sc.nextLine();
        String[] arr = nums.split(" ");
        
        for(String num : arr) {
            if(num.equals("0")) {
                break;
            } else {
                System.out.println(num);
            }
        }
        
	}

}
