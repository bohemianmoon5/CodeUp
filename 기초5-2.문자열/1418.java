import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    List<Integer> list = new ArrayList<>();
	    int index = s.indexOf("t");
	    
	    while(index != -1) {
	        list.add(index);
	        index = s.indexOf("t", index + 1);
	    }
	    
	    for(int i = 0; i < list.size(); i++) {
	        System.out.printf("%d ", list.get(i) + 1);
	    }
	    
	}

}
