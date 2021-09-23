import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    List<Integer> flist = new ArrayList<>();
	    List<Integer> llist = new ArrayList<>();
	    
	    for(int i = 1; i < 7; i++) {
	        for(int j = 1; j < 7; j++) {
	            if(i+j == n) {
	                flist.add(i);
	                llist.add(j);
	            }
	        }
	    }
	    Collections.sort(flist);
	    Collections.sort(llist, Collections.reverseOrder());
	    
	    for(int i = 0; i < flist.size(); i++) {
	        System.out.printf("%d %d\n", flist.get(i), llist.get(i));
	    }
	    
	}

}
