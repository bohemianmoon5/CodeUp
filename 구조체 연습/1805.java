import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    Map<Integer, Integer> map = new TreeMap<>();
	    
	    for(int i = 0; i < n; i++) {
	        map.put(sc.nextInt(), sc.nextInt());
	    }
	    
	    for(Integer key : map.keySet()) {
	        System.out.printf("%d %d\n", key, map.get(key));
	    }

	}

}
