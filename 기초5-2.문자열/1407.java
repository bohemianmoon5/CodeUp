import java.io.*;

public class Main {

	public static void main(String[] args) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    try {
	        String[] str = br.readLine().split(" ");
	        for(int i = 0; i < str.length; i++) {
	            System.out.printf("%s", str[i]);
	        }
	    } catch(IOException e) {
	        e.printStackTrace();
	    }

	}

}
