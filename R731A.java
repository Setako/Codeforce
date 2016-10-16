import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class R731A {
	
	public static HashMap<Character, Integer> charmap = new HashMap<>();
	
	public static void input(){
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i = 0;i< chars.length;i++)
		{
			charmap.put(chars[i], i);
		}
	}
	
	public static void main(String args[]) {
		input();
	    Scanner in = new Scanner(System.in);	    
	    char[] target = in.nextLine().toCharArray();
	    int ans = 0;
	    int current = 0;
	    for(int i =0;i< target.length;i++)
	    {
	    	int next = charmap.get(target[i]);
	    	int offset =0;
	    	if(current<13)
	    	{
	    		offset = Math.abs(next - current);
	    		if(offset>13){
	    			offset = Math.abs(next - (current+26));
	    		}
	    	}
	    	else if(next<13)
	    	{
	    		offset = Math.abs(next - current);
	    		if(offset>13){
	    			offset = Math.abs((next+26) - current);
	    		}
	    	}
	    	else{
	    		offset = Math.abs(next - current);
	    	}
	    	current = next;
	    	ans = ans+ offset;
	    }
	        System.out.println(ans);
	}
}
