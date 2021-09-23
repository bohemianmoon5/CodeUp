import java.io.*;

public class Main {

	public static void main(String[] args) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    try {
	        String[] str = br.readLine().split(" ");
	        int firstNum = parseInt(str[0]);
	        int gapNum = parseInt(str[1]);
	        int selectNum = parseInt(str[2]);
	        int result = firstNum;
	        for(int i = 1; i < selectNum; i++) {
	            result += gapNum;
	        }
	        System.out.print(result);
	    }catch(IOException e) {
	        e.printStackTrace();
	    }

	}
	public static int parseInt(String s) {
	    int i = Integer.parseInt(s);
	    return i;
	}

}
