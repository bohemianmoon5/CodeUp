import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int i;
	    List<Integer> list = new ArrayList<>();
	    
	    for(i = 1; i <= n; i++) {
	        if(n%i == 0) {
	            list.add(i);
	        }
	    }
	    
	    if(list.size() == 2) {
	        System.out.println("prime");
	    }else {
	        System.out.println("not prime");
	    }

	}

}
