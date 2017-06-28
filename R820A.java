import java.util.HashMap;
import java.util.Scanner;

public class R820A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int c = in.nextInt();
        int v0 = in.nextInt();
        int v1 = in.nextInt();
        int a = in.nextInt();
        int l = in.nextInt();

        int currentHead = 0;
        int days = 0;
        int prevDayRead = 0;
        while (currentHead<c){
        	int toDayRead = Math.min(v0 + a*days,v1);
        	int readback = Math.min(prevDayRead, l);
        	currentHead = currentHead + toDayRead - readback;
        	prevDayRead = toDayRead;
        	days++;
        }

        System.out.println(days);
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
