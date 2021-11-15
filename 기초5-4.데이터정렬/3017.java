import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    Student[] a = new Student[n];
	    
	    for(int i = 0; i < n; i++) {
	        Student s = new Student();
	        s.id = i+1;
	        s.math = sc.nextInt();
	        s.science = sc.nextInt();
	        a[i] = s;
	    }
	    
	    for(int i = a.length-1; i > 0; i--) {
	        for(int j = 0; j < i; j++) {
	            if(a[j].math < a[j+1].math) {
	                Student s = a[j];
	                a[j] = a[j+1];
	                a[j+1] = s;
	            }else if(a[j].math == a[j+1].math) {
	                if(a[j].science < a[j+1].science) {
	                    Student s = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = s;
	                }else if(a[j].science == a[j+1].science) {
	                    if(a[j].id > a[j+1].id) {
	                        Student s = a[j];
	                        a[j] = a[j+1];
	                        a[j+1] = s;
	                    }
	                }
	            }
	        }
	    }
	    
	    for(int i = 0; i < n; i++) {
	        System.out.printf("%d %d %d\n", a[i].id, a[i].math, a[i].science);
	    }
	    

	}

}

class Student {
    int id;
    int math;
    int science;
}
