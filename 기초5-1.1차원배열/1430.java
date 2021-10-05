import java.util.*;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			map.put(sc.nextInt(), 1);
		}
		
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int temp = sc.nextInt();
			if(map.containsKey(temp)) {
				System.out.print(map.get(temp));
			}else {
				System.out.print(0);
			}
			System.out.print(" ");
		}
	}

}
