import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String str = br.readLine();
	    br.close();
	    String result = "";
	    
	    for(int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if(65 <= c && c <= 90) {
	            result += String.valueOf(c).toLowerCase();
	        }else if(97 <= c && c <= 122) {
	            result += String.valueOf(c).toUpperCase();
	        }else {
	            result += c;
	        }
	    }
	    System.out.println(result);

	}

}
