import java.util.*;

public class Main {

	public static void main(String[] args) {

	    //시간초과
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    List<Integer> a = new ArrayList<>();
	    List<Integer> o = new ArrayList<>();
	    Map<Integer, Integer> m = new HashMap<>();
		
	    boolean flag = true;
	    int cnt = 0;
		
	    for(int i = 0; i < n; i++) {
		a.add(sc.nextInt());
		o.add(a.get(i));
	    }
		
	    Collections.sort(a);
		
	    for(int i = 0; i < n; i++) {
		m.put(i, a.get(i));
	    }
		
	    while(flag) {
		for(int i = 0; i < n; i++) {
		    if(o.get(cnt) == m.get(i)) {
			System.out.printf("%d ", i);
				cnt++;
		    }
		    if(cnt > n-1) {
			flag = false;
		    }
	    }
}
