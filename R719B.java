import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class R719B {

	public static void main(String[] args) {		
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();
	    char[] ip = in.nextLine().toCharArray();
	    boolean[] b = new boolean[n];
	    for(int i =0;i<n;i++)
	    {
	    	if(ip[i] == 'r')
	    	{
	    		b[i] = true;
	    	}
	    	if(ip[i] == 'b')
	    	{
	    		b[i] = false;
	    	}
	    }
	    int countrb=0;
	    int countbr =0;
	    boolean rTurn = true;
	    for(int i = 0;i<n;i++)
	    {
	    	if(rTurn)
	    	{
	    	if(b[i])
	    	{
	    		countrb++;
	    	}
	    	else{
	    		countbr++;
	    	}
	    	}
	    	else{
		    	if(b[i])
		    	{
		    		countbr++;
		    	}
		    	else{
		    		countrb++;
		    	}
	    	}
	    	rTurn = !rTurn;
	    }
	    
	    
	    
	        System.out.println(get(countrb>countbr, b));
	}
	
	public static int get(boolean rb,boolean[] in){
		List<Integer> wantR = new ArrayList<>();
		List<Integer> wantB = new ArrayList<>();
		for(int i =0;i<in.length;i++)
		{
			if(i%2==0)
			{
				if(in[i] !=rb){
					wantR.add(i);
				}
			}
			else{
					if(in[i] ==rb){
						wantB.add(i);
					}
			}
		}
		if(wantR.size()>wantB.size())
		{
			return wantR.size();
		}
		else{
			return wantB.size();
		}
	}
}

