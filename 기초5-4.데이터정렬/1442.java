import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    //선택정렬
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[] a = new int[10001];
	    
	    int n = sc.nextInt();
	    
	    for(int i = 1; i <= n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    for(int i = 1; i < n; i++) {
	        int m = i;
	        for(int j = i+1; j <= n; j++) {
	            if(a[j] < a[m]) {
	                m = j;
	            }
	        }
	        int t = a[i];
	        a[i] = a[m];
	        a[m] = t;
	    }
	    
	    for(int i = 1; i <= n; i++) {
	        System.out.println(a[i]);
	    }

	}

}
