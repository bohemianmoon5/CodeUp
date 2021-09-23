import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        sc.nextLine();
        String numbers = sc.nextLine();
        
        String[] arr = numbers.split(" ");
        
        for(int i = 0; i < total; i++) {
            System.out.println(arr[i]);
        }
    
	}

}
