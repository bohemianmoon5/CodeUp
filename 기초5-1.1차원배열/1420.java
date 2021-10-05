import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    String[] name = new String[n];
	    Integer[] score = new Integer[n];
	    Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
	    List<String> list = new ArrayList<>();
	    
	    for(int i = 0; i < n; i++) {
	        name[i] = sc.next();
	        score[i] = sc.nextInt();
	        map.put(score[i], name[i]);
	    }
        
        for(int i = 0; i < n; i++) {
            list.addAll(map.values());
        }
        
        System.out.println(list.get(2));
	}

}
