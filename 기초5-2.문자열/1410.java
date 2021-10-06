import java.io.*;

public class Main {

	public static void main(String[] args) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int s = 0;
	    int e = 0;
	    
	    try {
	        String[] str = br.readLine().split("");
	        for(int i = 0; i < str.length; i++) {
	            if(str[i].equals("(")) {
	                s++;
	            }else if(str[i].equals(")")) {
	                e++;
	            }
	        }
	        System.out.printf("%d %d", s, e);
	    }catch(IOException t) {
	        t.printStackTrace();
	    }

	}

}
