import java.util.*;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] standard = sc.nextLine().split(" ");
		String[] student = sc.nextLine().split(" ");
		
		List<Integer> list = new ArrayList<>();
		int check = parse(standard[1]);
		
		for(int i = 0; i < parse(standard[0]); i++) {
			list.add(parse(student[i]));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < check; i++) {
			if(i == (parse(standard[0])-1)) {
				System.out.printf("%d ", list.get(i));
				break;
			}else if(i == check - 1) {
				check *= 2;
				System.out.printf("%d \n", list.get(i));
			}else {
				System.out.printf("%d ", list.get(i));
			}
		}
	}
	public static int parse(String s) {
		return Integer.parseInt(s);
	}
}
