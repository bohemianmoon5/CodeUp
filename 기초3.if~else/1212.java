import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        
        int max = Collections.max(list);
        
        if(max == a) {
            if(a < (b + c)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }else if(max == b) {
             if(b < (a + c)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }else if(max == c) {
            if(c < (a + b)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }

	}

}
