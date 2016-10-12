import java.util.Scanner;

public class R716A {
	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int c = in.nextInt();
	    in.nextLine();
	    int[] arr = new int[n];
	    for(int i = n-1;i>=0;i--){
	    	arr[i] = in.nextInt();
	    }
	    
	    int res = 0;
	    
	    for(int i = 0;i<n;i++){
	    	res++;
	    	if(i <n-1){
	    		if(arr[i]-arr[i+1]>c)
	    		{
	    			break;
	    		}
	    	}
	    }
	    
	    
	    
	    
	        System.out.println(res);
	}
}
