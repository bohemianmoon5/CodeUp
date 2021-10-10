import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int h, w, n, l, d, x, y;
	    
	    h = sc.nextInt();
        w = sc.nextInt();
        
        int[][] a = new int[h][w];
        
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            l = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            
            for(int j = 0; j < l; j++) {
                if(d == 0) {
                    a[x-1][y+j-1] = 1;
                }else {
                     a[x+j-1][y-1] = 1;
                }
            }
        }
        
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
	}

}
