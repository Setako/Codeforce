import java.util.HashMap;
import java.util.Scanner;

public class R822A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(factorial(Math.min(a, b)));		
	}
	
	public static int factorial(int k){
		int reslut = 1;
		for(int i =1;i<=k;i++){
			reslut = reslut*i;
		}
		return reslut;
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
