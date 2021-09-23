import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   
	   float height = sc.nextFloat();
	   float weight = sc.nextFloat();
	   
	   double standard = (height - 100) * 0.9;
	   double condition = ((weight - standard) * 100) / standard;
	   
	   float result = Float.parseFloat(String.format("%.2f", condition));
	   
	   if(result <= 10) {
	       System.out.println("정상");
	   }else if(result > 10 && result <= 20) {
	       System.out.println("과체중");
	   }else {
	       System.out.println("비만");
	   }

	}

}
