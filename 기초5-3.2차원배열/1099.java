import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[10][10];
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		int x = 1;
		int y = 1;
		
		while(a[y][x] != 2){
		    
			a[y][x] = 9;
			
			if(a[y][x+1] != 1) {
			    x++;
			}else if(a[y+1][x] != 1) {
			    y++;
			}else {
			    break;
			}
		}
		
		a[y][x] = 9;
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
