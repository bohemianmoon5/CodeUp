import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(a);
	    
	    int i = 0;
	    int j = a.length - 1;
	    
	    int gap = Integer.MAX_VALUE;
	    int result1 = 0;
	    int result2 = 0;
	    
	    int temp;
	    int sum;
	    
	    while(i < j) {
	        sum = a[i] + a[j];
	        temp = Math.abs(sum);
	        if(temp < gap) {
	            gap = temp;
	            result1 = a[i];
	            result2 = a[j];
	        }
	        if(sum > 0) {
	            j--;
	        }else {
	            i++;
	        }
	    }
	    System.out.printf("%d %d", result1, result2);

	}

}
