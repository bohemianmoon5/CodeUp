import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String[] str = sc.nextLine().split("");
	    Character[] c1 = new Character[str.length];
	    Character[] c2 = new Character[str.length];
	    
	    for(int i = 0; i < str.length; i++) {
	        c1[i] = (char)((int)(str[i].charAt(0)) + 2);
	        c2[i] = (char)(int)((((str[i].charAt(0)) * 7) % 80) + 48);
	    }
	    
	    for(Character out : c1) {
	        System.out.print(out);
	    }
	    System.out.println();
	    
	    for(Character out : c2) {
	        System.out.print(out);
	    }

	}

}
