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
	    
	    Collections.sort(list);
	    System.out.print(list.get(0));

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
