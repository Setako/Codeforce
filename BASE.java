import java.util.Scanner;
import static java.lang.Math.min;
import static java.lang.Math.max;
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class BASE {
    static Scanner in = new Scanner(System.in);
    public static void solve(){
		
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

    public static void printf(String f, Object... args){
        System.out.printf(f,args);
    }
}

class Pair<A,B>{
    A a;
    B b;
    public Pair(A a, B b){
        this.a = a;
        this.b = b;
    }
}
