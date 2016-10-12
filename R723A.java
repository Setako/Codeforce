import java.util.Arrays;
import java.util.Scanner;

public class R723A {
	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);	    
	    int[] arr = new int[]{in.nextInt(),in.nextInt(),in.nextInt()};
	    Arrays.sort(arr);
	    int offset = Math.abs(arr[0]-arr[1])+Math.abs(arr[2]-arr[1]);
	    
	        System.out.println(offset);
	}
}
