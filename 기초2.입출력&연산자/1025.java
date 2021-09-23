import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        int A = Integer.valueOf(arr[0]);
        int B = Integer.valueOf(arr[1]);
        int C = Integer.valueOf(arr[2]);
        int D = Integer.valueOf(arr[3]);
        int E = Integer.valueOf(arr[4]);
        System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]", A * 10000, B * 1000, C * 100, D * 10, E);
        
        
    }
}
