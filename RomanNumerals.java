import java.util.*;


public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "XII";
		romanToInt(str);
		String str2 = "MCXLV";
		romanToInt(str2);
	}
	
	public static int romanToInt(String s) {
		int answer = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
     
        char[] chars = s.toCharArray();
        
        for(int i=0; i<chars.length; i++) {
        	if(chars[i] =='I') {
        		arr.add(1);
        	}
        	else if(chars[i] == 'V') {
        		arr.add(5);
        	}
        	else if(chars[i] == 'X') {
        		arr.add(10);
        	}
        	else if(chars[i] == 'L') {
        		arr.add(50);
        	}
        	else if(chars[i] == 'C') {
        		arr.add(100);
        	}
        	else if(chars[i] == 'D') {
        		arr.add(500);
        	}
        	else if(chars[i] == 'M') {
        		arr.add(1000);
        	}
        	else {
        		continue;
        	}
        }
        	
        for(int j=arr.size()-1; j>=0; j--) {
        	if(4 * arr.get(j) < answer) {
        		answer -= arr.get(j);
        	}
        	else {
        		answer += arr.get(j);
        	}
        }
        	
        
        return answer;
	}

}
