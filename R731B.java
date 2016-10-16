import java.util.HashMap;
import java.util.Scanner;

public class R731B {
	
	public static HashMap<Character, Integer> charmap = new HashMap<>();

	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);	    
	    int n = in.nextInt();
	    in.nextLine();
	    int[] arr = new int[n];
	    for(int i = 0; i<n;i++)
	    {
	    	arr[i] = in.nextInt();
	    }
	    int p = 0;
	    for(int i = 0;i<arr.length;i++)
	    {
	    	if(p>0)
	    	{
	    		if(arr[i]==0)
	    		{
	    			System.out.println("NO");
	    			return;
	    		}else{
	    			p = 0;
	    			arr[i] = arr[i]-1;
	    		}
	    	}
	    	p = arr[i]%2;
	    }
	    if(p>0)
	    {
			System.out.println("NO");
	    }
	    else{
			System.out.println("YES");
	    }
	}
}
