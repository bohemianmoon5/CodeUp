﻿import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    if(zero(n)) {
	        System.out.println("zero");
	    }else {
	        System.out.println("non zero");
	    }

	}
	static boolean zero(int n) {
	    if(n == 0) {
	        return true;
	    }else {
	        return false;
	    }
	}

}
