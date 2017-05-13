package Failed;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Failed
 * Time limit exceeded
 *
 */

public class R805D {
	static Scanner in = new Scanner(System.in);

	public static void solve() {
		String s = in.nextLine();
		char[] sarr = s.toCharArray();
		BigInteger reslut = new BigInteger("0");
		int n = s.length();
		BigInteger counting = new BigInteger("0");
		for(int i =n-1;i>=0;i--){
			if(sarr[i]=='b'){
				counting = counting.add(new BigInteger("1"));
			}
			if(sarr[i]=='a'){
				reslut = reslut.add(counting).mod(new BigInteger("1000000007"));
				counting = counting.multiply(new BigInteger("2"));
			}
		}
		System.out.println(reslut);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashMap charOrderMap(HashMap inputMap, String orderingString, int startFrom, boolean charAsKey) {
		char[] chars = orderingString.toCharArray();
		if (charAsKey) {
			for (int i = 0; i < chars.length; i++) {
				inputMap.put(chars[i], i + startFrom);
			}
		} else {
			for (int i = 0; i < chars.length; i++) {
				inputMap.put(i + startFrom, chars[i]);
			}
		}
		return inputMap;
	}

	public static void main(String args[]) {
		solve();
	}

	public static double quadraticEquationRootMax(double a, double b, double c) {
		double root1, root2;
		root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		return Math.max(root1, root2);
	}

	public static double quadraticEquationRootMin(double a, double b, double c) {
		double root1, root2;
		root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		return Math.min(root1, root2);
	}
}
