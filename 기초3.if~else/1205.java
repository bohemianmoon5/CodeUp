import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        int[] arr = new int[10];
        arr[0] = (int)(a + b);
        arr[1] = (int)(b + a);
        arr[2] = (int)(a - b);
        arr[3] = (int)(b - a);
        arr[4] = (int)(a * b);
        arr[5] = (int)(b * a);
        arr[6] = (int)(a / b);
        arr[7] = (int)(b / a);
        arr[8] = (int)(Math.pow(a, b));
        arr[9] = (int)(Math.pow(b, a));
        
        for(int i = 0; i < 10; i++) {
            for(int j = i + 1; j < 10; j++) {
                if(!(arr[i] < arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } 
        }    
        System.out.printf("%.6f", (float)arr[9]);
        
    }
    
}
