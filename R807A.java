import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class R807A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int n = in.nextInt();
		Integer[] a  = new Integer[n];
		Integer[] b  = new Integer[n];
		for(int i = 0;i<n;i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		if(!Arrays.equals(a,b)){
			System.out.println("rated");
		}else{
			Integer[] c = a.clone();
			Arrays.sort(c, Collections.reverseOrder());
			if(Arrays.equals(c,a)){//it is order
				System.out.println("maybe");
			}
			else{
				System.out.println("unrated");
			}
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashMap charOrderMap(HashMap inputMap,String orderingString,int startFrom,boolean charAsKey){
		char[] chars = orderingString.toCharArray();
		if(charAsKey){
			for(int i = 0;i< chars.length;i++){
				inputMap.put(chars[i], i+startFrom);
			}
		}
		else{
			for(int i = 0;i< chars.length;i++){
				inputMap.put(i+startFrom, chars[i]);
			}
		}
		return inputMap;
	}
	
	public static void main(String args[]) {
		solve();
	}
	
	public static double quadraticEquationRootMax(double a, double b, double c){    
	    double root1, root2;
	    root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
	    root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
	    return Math.max(root1, root2);  
	}
	
	public static double quadraticEquationRootMin(double a, double b, double c){    
	    double root1, root2;
	    root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
	    root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
	    return Math.min(root1, root2);  
	}
}
