import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    List<Integer> a = new ArrayList<>();
	    
	    for(int i = 0; i < n; i++) {
	        a.add(sc.nextInt());
	    }
	    
	    Collections.sort(a);
	    Collections.reverse(a);
	    
	    for(Integer all : a) {
	        System.out.printf("%d ", all);
	    }

	}

}
