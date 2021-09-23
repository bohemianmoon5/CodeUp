import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	int a = sc.nextInt();
	int b = sc.nextInt();
		
	if(a % 2 == 0 && b % 2 == 0) {
		System.out.println("짝수+짝수=짝수");
	} else if(a % 2 != 0 && b % 2 == 0) {
		System.out.println("홀수+짝수=홀수");
	} else if(a % 2 == 0 && b % 2 != 0) {
		System.out.println("짝수+홀수=홀수");
	} else {
		System.out.println("홀수+홀수=짝수");
	}

    }// main
    
}
