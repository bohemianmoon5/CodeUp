import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int noAd = sc.nextInt();
        int goAd = sc.nextInt();
        int cost = sc.nextInt();
        
        if(noAd > (goAd - cost)) {
            System.out.println("do not advertise");
        }else if(noAd < (goAd - cost)) {
            System.out.println("advertise");
        }else {
            System.out.println("does not matter");
        }

	}

}
