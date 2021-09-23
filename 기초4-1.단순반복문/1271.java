import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int length = sc.nextInt();
	    sc.nextLine();
	    String[] arr = sc.nextLine().split(" ");
	    List<Integer> list = new ArrayList<>();
	    
	    for(int i = 0; i < length; i++) {
	        list.add(parse(arr[i]));
	    }
	    
	    Collections.sort(list);
	    
	    System.out.println(list.get(length-1));

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
