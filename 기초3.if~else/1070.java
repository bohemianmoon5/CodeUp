﻿import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if(a == 1 || a == 2 || a == 12) {
            System.out.println("winter");
        } else if(a == 3 || a == 4 || a == 5) {
            System.out.println("spring");
        } else if(a == 6 || a == 7 || a == 8) {
            System.out.println("summer");
        } else {
            System.out.println("fall");
        }
        
    }
    
}
