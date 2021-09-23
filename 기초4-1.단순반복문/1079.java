import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String alpha = sc.nextLine();
        String[] arr = alpha.split(" ");
        
        for(int i = 0; i < arr.length; i++) {
            if(!(arr[i].equals("q"))) {
                System.out.println(arr[i]);
            }else if(arr[i].equals("q")) {
                System.out.println('q');
                break;
            }
        }
        
	}

}
