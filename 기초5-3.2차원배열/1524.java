import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] map = new int[12][12];
	    
	    for(int i = 1; i <= 9; i++) {
	        for(int j = 1; j <= 9; j++) {
	            map[i][j] = sc.nextInt();
	        }
	    }
	    
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    if(map[x][y] == 1) {
	        System.out.println(-1);
	    }else {
	        System.out.printf("%d", map[x-1][y-1] + map[x-1][y] + map[x-1][y+1] + map[x][y-1] + map[x][y+1] + map[x+1][y-1] + map[x+1][y] + map[x+1][y+1]);
	    }

	}

}
