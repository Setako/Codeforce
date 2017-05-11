import java.sql.Time;
import java.util.HashMap;
import java.util.Scanner;

public class R799A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int n = in.nextInt();
		int t = in.nextInt();
		int k = in.nextInt();
		int d = in.nextInt();
		
		int c =0;
		
		int bakeTime = (int)Math.ceil(n/k);
		int withOne = bakeTime*t;
		
		
		int bakeWhenB = (int)Math.floor(d/t);
		n = n-bakeWhenB*k;
		if(t<=d){
			if((n/k)%2>0){//odd
				c= t+(int)Math.ceil(Math.ceil(n/k)/2)*t;
			}
			else{
				c=d+(int)Math.ceil(Math.ceil(n/k)/2)*t;
			}
		}
		else{
			if((n/k)%2>0){//odd
				c= (int)Math.ceil(Math.ceil(n/k)/2)*t;
			}
			else{
				c=d+(int)Math.ceil(Math.ceil(n/k)/2)*t;
			}
		}
		
		if(c>=withOne){
			System.out.println("NO");
		}else{
			System.out.println("YES");
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
