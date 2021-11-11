import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    //시간초과
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[] a = new int[100001];
	    int n =  sc.nextInt();
	    int max = 0;
		
	    for(int i = 0; i < n; i++) {
		int t = sc.nextInt();
		a[t]++;
		if(t > max) {
		    max = t;
		}
	    }
		
	    for(int i = 0; i <= max; i++) {
		for(int j = 0; j < a[i]; j++) {
		    System.out.printf("%d ", i);
		}
	    }

	}

}
