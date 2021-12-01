import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[] rank1 = new int[n];
	    int[] rank2 = new int[n];
	    studentInfo[] a = new studentInfo[n];
	    
	    for(int i = 0; i < n; i++) {
	        String name = sc.next();
	        int score1 = sc.nextInt();
	        int score2 = sc.nextInt();
	        int score3 = sc.nextInt();
	        
	        studentInfo info = new studentInfo();
	        info.name = name;
	        info.score1 = score1;
	        info.score2 = score2;
	        info.score3 = score3;
	        a[i] = info;
	    }
	    
	    for(int i = a.length - 1; i > 0; i--) {
	        for(int j = 0; j < i; j++) {
	            if(a[j].score1 < a[j+1].score1) {
	                studentInfo info = a[j];
	                a[j] = a[j+1];
	                a[j+1] = info;
	            }
	        }
	    }
	    
	    for(int i = 0; i < n; i++) {
	        rank1[i] = 1;
	        for(int j = 0; j < n; j++) {
	            if(a[i].score2 < a[j].score2) {
	                rank1[i]++;
	            }
	        }
	    }
	    
	    for(int i = 0; i < n; i++) {
	        rank2[i] = 1;
	        for(int j = 0; j < n; j++) {
	            if(a[i].score3 < a[j].score3) {
	                rank2[i]++;
	            }
	        }
	    }
	    
	    System.out.printf("%s %d %d", a[0].name, rank1[0], rank2[0]);

	}

}

class studentInfo {
    String name;
    int score1;
    int score2;
    int score3;
}
