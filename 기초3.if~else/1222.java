﻿import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int currentTime = sc.nextInt();
        int ourScore = sc.nextInt();
        int otherScore = sc.nextInt();
        int count = 0;
        
        if(currentTime < 90) {
            for(int i = (currentTime / 5); i < 18; i++) {
                count++;
            }
        }
        
        if((ourScore + count) > otherScore) {
            System.out.println("win");
        }else if((ourScore + count) == otherScore) {
            System.out.println("same");
        }else {
            System.out.println("lose");
        }
    
	}

}
