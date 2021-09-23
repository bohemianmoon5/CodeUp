import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int cnt = 0;
        
        for(int i = 0; i < length; i++) {
            if((parse(arr[i])%2) == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
	}
    public static int parse(String s) {
        return Integer.parseInt(s);
    }
}
