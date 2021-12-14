import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    Schedule[] scheduleInfo = new Schedule[n];
	    
	    for(int i = 0; i < n; i++) {
	        Schedule schedule = new Schedule();
	        
	        schedule.title = sc.next();
	        schedule.year = sc.next();
	        schedule.month = sc.next();
	        schedule.day = sc.next();
	        
	        schedule.year = String.format("%04d", Integer.parseInt(schedule.year));
	        scheduleInfo[i] = schedule;
	    }
	    
	    for(int i = scheduleInfo.length - 1; i > 0; i--) {
	        for(int j = 0; j < i; j++) {
	            String str = scheduleInfo[j].compareStr();
	            String afterStr = scheduleInfo[j+1].compareStr();
	            
	            if(str.compareTo(afterStr) > 0) {
	                Schedule temp = scheduleInfo[j];
	                scheduleInfo[j] = scheduleInfo[j+1];
	                scheduleInfo[j+1] = temp;
	            }
	        }
	    }
	    
	    for(int i = 0; i < scheduleInfo.length; i++) {
	        System.out.println(scheduleInfo[i].title);
	    }

	}

}
class Schedule {
    String title;
    String year;
    String month;
    String day;
    
    public String compareStr() {
        return year + month + day + title;
    }
}
