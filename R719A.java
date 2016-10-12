import java.util.Scanner;

public class R719A {
	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();
	    
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++){
	    	arr[i] = in.nextInt();
	    }
	    
	    if(arr[n-1]==15)
	    {
	        System.out.println("DOWN");
	        return;
	    }
	    if(arr[n-1]==0)
	    {
	        System.out.println("UP");
	        return;
	    }
	    
	    if(n <=1)
	    {
	        System.out.println(-1);
	        return;
	    }
	    
	    int offset = arr[n-1]-arr[n-2];
	    if(offset>0)
	    {
	        System.out.println("UP");
	        return;
	    }
	    if(offset<0){
	        System.out.println("DOWN");
	        return;
	    }	    
        System.out.println("-1");
	}
}
