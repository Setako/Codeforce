import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * 
 * Failed
 * Time limit exceeded
 *
 */
public class R799B {
	
    static Scanner in = new Scanner(System.in);
    
    static HashMap<Integer, List<cloth>> clothWithA = new HashMap<>();
    static HashMap<Integer, List<cloth>> clothWithB = new HashMap<>();
	public static void solve(){
		int n = in.nextInt();
		int pa[] = new int[n];
		int aa[] = new int[n];
		int ba[] = new int[n];
		String ans =null;
		for(int i=0;i<n;i++){
			pa[i] = in.nextInt();
		}
		for(int i=0;i<n;i++){
			aa[i] = in.nextInt();
		}
		for(int i=0;i<n;i++){
			ba[i] = in.nextInt();
		}
		for(int i=0;i<n;i++){
			cloth c = new cloth(pa[i], aa[i], ba[i]);
			if(clothWithA.get(aa[i])==null){
				clothWithA.put(aa[i], new ArrayList<>());
			}
			if(clothWithB.get(ba[i])==null){
				clothWithB.put(ba[i], new ArrayList<>());
			}
			clothWithA.get(aa[i]).add(c);
			clothWithB.get(ba[i]).add(c);
		}
		
		int m = in.nextInt();
		int ca[]= new int[m]; 
		for(int i = 0;i<m;i++){
			ca[i]  = in.nextInt();
		}
		for(int i = 0;i<m;i++){
			int searchingColor  = ca[i];
			TreeMap<Integer, cloth> priceSorting = new TreeMap<>();
			if(clothWithA.get(searchingColor)!=null){
				for(cloth c:clothWithA.get(searchingColor)){
					priceSorting.put(c.p, c);
				}
			}
			if(clothWithB.get(searchingColor)!=null){
				for(cloth c:clothWithB.get(searchingColor)){
					priceSorting.put(c.p, c);
				}
			}
			if(priceSorting.size()>0){
				cloth c = priceSorting.firstEntry().getValue();
				if(ans == null){
					ans = ""+c.p;
				}else{
					ans = ans + " " +c.p;
				}
				remove(c);
			}
			else{
				if(ans == null){
					ans = "-1";
				}else{
					ans = ans + " -1";
				}
			}
		}
		System.out.println(ans);
	}
	public static void remove(cloth c){
		clothWithA.get(c.a).remove(c);
		clothWithB.get(c.b).remove(c);
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
	
	static class cloth{
		int p = 0;
		int a = 0;
		int b= 0;
		public cloth(int p,int a,int b) {
			this.p = p;
			this.a = a;
			this.b = b;
		}
	}
}
