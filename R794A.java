import java.util.HashMap;
import java.util.Scanner;

public class R794A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
		int ans = 0;
		int[] x = new int[n];
		for(int i =0;i<n;i++){
			x[i] = in.nextInt();
		}
		for(int i =0;i<n;i++){
			if(x[i]<=a&&x[i]>b){
				ans++;
			}
			else if(x[i]>=a&&x[i]<c){
				ans++;
			}
		}
		System.out.println(ans);
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
