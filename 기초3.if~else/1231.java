import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String request = sc.nextLine();
        StringTokenizer token = new StringTokenizer(request, "+-*/");
        
        for(int i = 0; i < request.length(); i++) {
            char opr = request.charAt(i);
            switch (opr) {
                case '+':
                    int a = Integer.parseInt(token.nextToken());
                    int b = Integer.parseInt(token.nextToken());
                    System.out.print(a + b);
                    break;
                case '-':
                    int c = Integer.parseInt(token.nextToken());
                    int d = Integer.parseInt(token.nextToken());
                    System.out.print(c - d);
                    break;
                case '*':
                    int e = Integer.parseInt(token.nextToken());
                    int f = Integer.parseInt(token.nextToken());
                    System.out.print(e * f);
                    break;
                case '/':
                    int g = Integer.parseInt(token.nextToken());
                    int h = Integer.parseInt(token.nextToken());
                    System.out.printf("%.2f", (float)g / (float)h);
            }
        }
        
	}

}
