import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class R723B {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();
	    String s = " "+in.nextLine();
	    String[] arr = s.split("(\\(|\\))");
	    int mxo = 0;
	    int ins = 0;
	    
	    boolean inQ = false;
	    for(int i = 0;i<arr.length;i++)
	    {
	    	if(inQ)
	    	{
	    		String[] ia = arr[i].split("_");
	    		for(int a = 0;a<ia.length;a++)
	    		{
	    			if(ia[a].length()>0)
	    			{
	    			mxo++;
	    			}
	    		}
	    	}
	    	else{
	    		String[] ia = arr[i].split("_");
	    		for(int a = 0;a<ia.length;a++)
	    		{
	    			
	    			if(ia[a].replace(" ", "").length()>ins)
	    			{
	    				ins = ia[a].replace(" ", "").length();
	    			}
	    		}
	    	}
	    			inQ = !inQ;
	    }
        System.out.println(ins);
	        System.out.println(mxo);
	}
	
	
	
	

}
