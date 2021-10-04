import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    sc.nextLine();
	    String[] str = sc.nextLine().split(" ");
	    
	    int cnt = 0;
	    int check = 1;
	    List<Integer> list = new ArrayList<>();
	    
	    for(int i = 0; i < n; i++) {
	        list.add(parse(str[i]));
	    }
	    
	    for(int i = 1; i < n+1; i++) {
	        System.out.printf("%d ", list.get(i-1));
	        cnt++;
	        if(cnt == n*check) {
	            int first = list.get(0);
	            list.remove(0);
	            list.add(first);
	            i = 0;
	            check++;
	            System.out.println();
	        }
	        if(cnt == n*n) {
	          break;  
	        }
	    }

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
