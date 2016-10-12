import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class R721B {
	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int k = in.nextInt();
	    int max = 0;
	    HashMap<Integer, List<String>> input = new HashMap<>();
	    in.nextLine();	    
        
	    int ans = 0;
	    List<String> added = new ArrayList<>();
	    
        for(int i =0;i<n+1;i++)
        {
        	String ining = 	    in.nextLine();	   
        	if(i == n)
        	{
        		ans = ining.length();
        		continue;
        	}
        	if(!input.keySet().contains(ining.length()))
        	{
        		if(ining.length()>max)
        		{
        			max = ining.length();
        		}
        		input.put(ining.length(), new ArrayList<>());
        	}
        	for(String com:added)
        	{
        		if(com.equals(ining))
        		{
        			continue;
        		}
        	}
        	added.add(ining);
        	input.get(ining.length()).add(ining);
        }
        
        int best = 1;
        int worse = 0;
        
        for(int i = 1;i<= max;i++)
        {
        	if(input.get(i)==null)
        			{
        		continue;
        			}
        	List<String> strings = input.get(i);
    		worse = worse + strings.size();
          	if(i == ans)
        	{
        		break;
        	}
          	best = best + strings.size();
        }
        
        long wora = Math.round(Math.floor((worse-1)/k))*5;
        long besta = Math.round(Math.floor((best-1)/k))*5;
        
        
        System.out.println((best+besta) + " " + (worse+wora));
	}
}
