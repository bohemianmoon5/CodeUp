import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    
    static Double d;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    d = sc.nextDouble();
	    
	    DecimalFormat df = new DecimalFormat("#.##########");
	    
	    System.out.println(df.format(abs(d)));

	}
	static Double abs(Double d) {
	    if(d >= 0) {
	        return d;
	    }else {
	        return -d;
	    }
	}

}
