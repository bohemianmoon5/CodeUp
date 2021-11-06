import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
        //버블정렬
        
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[10001];
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= n-1; j++) {
                if(a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        
        for(int i = 1; i <= n; i++) {
            System.out.println(a[i]);
        }
        
	}

}
