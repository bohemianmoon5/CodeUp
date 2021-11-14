import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    List<Integer> list = new ArrayList<>();
	    
	    for(int i = 0; i < 7; i++) {
	        list.add(sc.nextInt());
	    }
	    
	    Collections.sort(list);
	    Collections.reverse(list);
	    
	    System.out.printf("%d\n%d", list.get(0), list.get(1));
	    
	}

}
