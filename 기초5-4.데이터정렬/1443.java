import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    //삽입정렬	    

	    Scanner sc = new Scanner(System.in);
	    
	    int[] a = new int[10001];
	    
	    int n = sc.nextInt();
	    int i, j, k;
	    
	    for(i = 1; i <= n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    for(i = 2; i <= n; i++) {
	        k = a[i];
	        for(j = i-1; j >= 0; j--) {
	            if(a[j] > k) {
	                a[j+1] = a[j];
	            }else {
	                break;
	            }
	        }
	        a[j+1] = k;
	    }
	    
	    for(i = 1; i <= n; i++) {
	        System.out.println(a[i]);
	    }

	}

}
