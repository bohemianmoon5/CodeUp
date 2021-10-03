import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    sc.nextLine();
	    String[] str = sc.nextLine().split(" ");
	    
	    List<Integer> list = new ArrayList<>();
	    
	    for(int i = 0; i < n; i++) {
	        list.add(parse(str[i]));
	    }
        
        for(int i = n-1; i >= 0; i--) {
            System.out.printf("%d ", list.get(i));
        }
	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
