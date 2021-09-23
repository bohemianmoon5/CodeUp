import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    List<Integer> intList = new ArrayList<>();
	    List<String> strList = new ArrayList<>();
	    String temp = "";
	    
	    try {
	        String[] s = br.readLine().split("");
	        for(int i = 0; i < s.length; i++) {
	            switch (s[i]) {
	                case "+":
	                    intList.add(parse(temp));
	                    strList.add(s[i]);
	                    temp = "";
	                    break;
	                case "-":
	                    intList.add(parse(temp));
	                    strList.add(s[i]);
	                    temp = "";
	                    break;
	                case "*":
	                    intList.add(parse(temp));
	                    strList.add(s[i]);
	                    temp = "";
	                    break;
	                case "/":
	                    intList.add(parse(temp));
	                    strList.add(s[i]);
	                    temp = "";
	                    break;
                    case "=":
                        intList.add(parse(temp));
                        strList.add(s[i]);
                        temp = "";
                        break;
                    default:
                        temp += s[i];
                        break;
	            }
	        }
	        
	        int n = intList.get(0);
	        int sum = n;
	        
	        for(int i = 0; i < strList.size(); i++) {
	            switch (strList.get(i)) {
	                case "+":
	                    n = intList.get(i + 1);
	                    sum += n;
	                    break;
	                case "-":
	                    n = intList.get(i + 1);
	                    sum -= n;
	                    break;
	                case "*":
	                    n = intList.get(i + 1);
	                    sum *= n;
	                    break;
	                case "/":
	                    n = intList.get(i + 1);
	                    sum /= n;
	                    break;
                    case "=":
                        System.out.println(sum);
                        break;
	            }
	        }
	       
	    }catch(IOException e) {
	        e.printStackTrace();
	    }

	}
	public static int parse(String s) {
	    return Integer.parseInt(s);
	}

}
