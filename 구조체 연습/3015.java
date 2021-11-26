import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int total = sc.nextInt();
	    int pick = sc.nextInt();
	    
	    db[] a = new db[total];
	    
	    for(int i = 0; i < total; i++) {
	        String name = sc.next();
	        int score = sc.nextInt();
	        
	        db data = new db();
	        data.name = name;
	        data.score = score;
	        
	        a[i] = data;
	    }
	    
	    for(int i = a.length - 1; i > 0; i--) {
	        for(int j = 0; j < i; j++) {
	            if(a[j].score < a[j+1].score) {
	                db data = a[j];
	                a[j] = a[j+1];
	                a[j+1] = data;
	            }
	        }
	    }
	    
	    for(int i = 0; i < pick; i++) {
	        System.out.printf("%s\n", a[i].name);
	    }

	}

}

class db {
    String name;
    int score;
}
