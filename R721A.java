import java.util.Scanner;

public class R721A {
	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();	    
	    String[] arr = in.nextLine().split("W");
        int resn = 0;
        String res ="";
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i].length() == 0){continue;}
        	resn ++;
        	res = res + arr[i].length()+" ";
        }
        System.out.println(resn);
        System.out.println(res);
	}
}
