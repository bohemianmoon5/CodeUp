import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    HashMap<Character, Integer> map = new HashMap<>();
	    for(int i = 97; i <= 122; i++) {
	        map.put((char)i, 0);
	    }
	    
	    try {
	        String[] str = br.readLine().split(" ");
	        for(int i = 0; i < str.length; i++) {
	            for(int j = 0; j < str[i].length(); j++) {
	                if(map.containsKey(str[i].charAt(j))) {
	                    map.put(str[i].charAt(j), map.get(str[i].charAt(j)) + 1);
	                }
	            }
	        }
	        
	    }catch(IOException e) {
	        e.printStackTrace();
	    }
	    for(Character key : map.keySet()) {
	        System.out.printf("%c:%d\n", key, map.get(key));
	    }

	}

}
