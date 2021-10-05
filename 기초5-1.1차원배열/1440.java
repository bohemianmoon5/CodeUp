import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    sc.nextLine();
	    String[] str = sc.nextLine().split(" ");
	    
	    for(int i = 0; i < n; i++) {
	        System.out.printf("%d: ", i + 1);
	        for(int j = 0; j < n; j++) {
	            if(i != j) {
	                if(parse(str[i]) > parse(str[j])) {
	                    System.out.print("> ");
	                }else if (parse(str[i]) == parse(str[j])) {
	                    System.out.print("= ");
	                }else {
	                    System.out.print("< ");
	                }
	            }
	        }
	        System.out.println();
	    }

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
