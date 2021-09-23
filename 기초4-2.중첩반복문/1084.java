import java.io.*;

public class Main {

	public static void main(String[] args) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
    	    try {
    	    String[] arr = br.readLine().split(" ");
    	    int cnt = 0;
    	    
    	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	    
    	    for(int i = 0; i < Integer.valueOf(arr[0]); i++) {
    	        for(int j = 0; j < Integer.valueOf(arr[1]); j++) {
    	            for(int k = 0; k < Integer.valueOf(arr[2]); k++) {
    	                bw.write(i + " " + j + " " + k + "\n");
    	                cnt++;
    	            }
    	        }
    	    }
    	    bw.write(String.valueOf(cnt));
    	    bw.flush();
	    
	    }catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	}

}
