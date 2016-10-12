import java.util.Scanner;

public class R722A {
	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();
	    char[] arr =in.nextLine().replace(":", "").toCharArray();
	    if(Integer.parseInt(""+arr[2])>5)
	    {
	    	arr[2] = '0';
	    }
	   if(n == 12)
	   {
		   if(Integer.parseInt(""+arr[0])==1)
		   {
			   if(Integer.parseInt(""+arr[1])>2)
			   {
				   arr[1] ='0';
			   }
		   }
		   else if(Integer.parseInt(""+arr[0])>1)
		   {
			   if(Integer.parseInt(""+arr[1])>2)
			   {
				   arr[0] ='0';
			   }
			   else{
				   arr[0] ='1';
			   }
		   }
		   else if(Integer.parseInt(arr[1]+"")==0) //00:xx
		   {
			   arr[1] ='1';
		   }
	   }
	   
	   if(n == 24)
	   {
		   if(Integer.parseInt(""+arr[0])==2)
		   {
			   if(Integer.parseInt(""+arr[1])>3)
			   {
				   arr[1] ='0';
			   }
		   }
		   else if(Integer.parseInt(""+arr[0])>2)
		   {
				   arr[0] ='1';
		   }
	   }
	    
	        System.out.println(arr[0] +""+arr[1] +":"+arr[2] +""+arr[3] );
	}
}
