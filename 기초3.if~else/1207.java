import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        
        if(a == 1)
            cnt++;
        if(b == 1)
            cnt++;
        if(c == 1)
            cnt++;
        if(d == 1)
            cnt++;
            
        switch(cnt) {
        case 0:
            System.out.println("모");
            break;
        case 1:
            System.out.println("도");
            break;
        case 2:
            System.out.println("개");
            break;
        case 3:
            System.out.println("걸");
            break;
        case 4:
            System.out.println("윷");
            break;
        }

	}

}
