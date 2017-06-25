import java.util.HashMap;
import java.util.Scanner;

public class R821A {
    static Scanner in = new Scanner(System.in);
    static 	int[][] arr;
    static int n=0;
	public static void solve(){
		n = in.nextInt();
		arr = new int[n][n];
		for(int x =0;x<n;x++){
			for (int y = 0;y<n;y++){
				arr[x][y] = in.nextInt();
			}
		}
		for(int x =0;x<n;x++){
			ex:
			for (int y = 0;y<n;y++){
				int target = arr[x][y];
				if(target == 1){
					continue ex;
				}
				int[] xarr = getX(x);
				int[] yarr = getY(y);
				for(int xa = 0;xa<n;xa++){
					for(int ya = 0;ya<n;ya++){
						if(xarr[xa]+yarr[ya]==target){
							continue ex;
						}
					}
				}
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		
	}
	
	public static int[] getX(int i){
		return arr[i];
	}
	public static int[] getY(int i){
		int[] reslut = new int[n];
		for(int x = 0;x<n;x++){
			reslut[x]= arr[x][i];
		}
		return reslut;
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
