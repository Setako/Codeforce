import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class R722B {

	public static void main(String[] args) {		
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();
	    int[] pa = new int[n];
	    char[][] arr= new char[n][];
	    for(int i =0;i<n;i++)
	    {
	    	pa[i] = in.nextInt();
	    }
	    in.nextLine();  
	    for(int i =0;i<n;i++)
	    {
		    arr[i] = in.nextLine().toCharArray();
	    }
	    
	    for(int i =0;i<n;i++)
	    {
    	int count = 0;
	    for(int i2 = 0;i2<arr[i].length;i2++)
	    {
	    	if(is(arr[i][i2]))
	    	{
	    		count++;
	    	}
	    }
	    if(count != pa[i])
	    {
	    	System.out.println("NO");
	    	return;
	    }
	    }
    	System.out.println("YES");	    
	    
	    
	    
	    
	}
	
	public static boolean is(char t){
		if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='y')
		{
			return true;
		}
		else{
			return false;
		}		
	}
	
	
	
	
	
	
	

}
