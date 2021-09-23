import java.io.*;

public class Main {

	public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String[] arr = br.readLine().split(" ");
            int check = 0;
            for(int i = 0; i < 10; i++) {
                check = parse(arr[i]);
                if(check%5 == 0) {
                    System.out.print(check);
                    break;
                }
            }
            if(check%5 != 0) {
                System.out.print(0);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
