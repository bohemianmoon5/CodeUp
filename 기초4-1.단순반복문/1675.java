import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String str = br.readLine();
	    br.close();
	    
	    for(int i = 0; i < str.length(); i++) {
	        if(97 <= str.charAt(i) && str.charAt(i) <= 99) {
	            System.out.printf("%c", str.charAt(i) + 23);
	        }else if(str.charAt(i) == 32) {
	            System.out.printf("%c", str.charAt(i));
	        }else {
	            System.out.printf("%c", str.charAt(i) - 3);
	        }
	    }

	}

}
