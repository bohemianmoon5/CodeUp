﻿import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int result = 0;
        
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                result += i;
            }
        }
        System.out.print(result);
	}

}
