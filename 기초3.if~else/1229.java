import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        float height = sc.nextFloat();
        float weight = sc.nextFloat();
        
        double standard = 0;
        
        if(height < 150) {
            standard = height - 100;
        } else if(height >= 150 && height < 160) {
            standard = (height - 150) / 2 + 50; 
        } else {
            standard = (height - 100) * 0.9;
        }
        
        double condition = ((weight - standard) * 100) / standard;
        
        float result = Float.parseFloat(String.format("%.2f", condition));
        
        if(result <= 10) {
            System.out.print("정상");
        } else if(result > 10 && result <= 20) {
            System.out.print("과체중");
        } else {
            System.out.print("비만");
        }
        
	}

}
