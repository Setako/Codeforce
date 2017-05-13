package Failed;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * 
 * Failed
 * Wrong answer
 *
 */

public class R794C {
	static Scanner in = new Scanner(System.in);

	public static void solve() {
		char[] arr1 = in.nextLine().toCharArray();
		char[] arr2 = in.nextLine().toCharArray();
		TreeMap<Character, Integer> chars1 = new TreeMap<>();
		TreeMap<Character, Integer> chars2 = new TreeMap<>(Collections.reverseOrder());
		for (char c : arr1) {
			if (chars1.get(c) == null) {
				chars1.put(c, 1);
			} else {
				chars1.put(c, chars1.get(c) + 1);
			}
		}
		for (char c : arr2) {
			if (chars2.get(c) == null) {
				chars2.put(c, 1);
			} else {
				chars2.put(c, chars2.get(c) + 1);
			}
		}
		String ans = "";
		String ansB = "";
		boolean is1 = true;
		for (int i = 0; i < arr1.length; i++) {
			int haveToPlace = (int) Math.ceil((arr1.length-i)/2.0);
			if (is1) {
				if ((extractF(chars2, false) + "").compareTo(extractF(chars1, false) + "") < 0) { // char2
																									// better
					ansB = extractNum(chars1, haveToPlace) + ansB;
				} else {
					ans = ans + extractF(chars1, true);
				}
			} else {
				if ((extractF(chars1, false) + "").compareTo(extractF(chars2, false) + "") > 0) { // char1
																									// better
					ansB = extractNum(chars2, haveToPlace) + ansB;
				} else {
					ans = ans + extractF(chars2, true);
				}
			}
			is1 = !is1;
		}
		System.out.println(ans+ansB);

	}

	static char extractF(TreeMap<Character, Integer> cs, boolean remove) {
		Entry<Character, Integer> entry = cs.firstEntry();
		if (remove) {
			if (entry.getValue() == 1) {
				cs.remove(entry.getKey());
			} else {
				cs.put(entry.getKey(), cs.get(entry.getKey()) - 1);
			}
		}
		return entry.getKey();
	}
	
	static char extractNum(TreeMap<Character, Integer> cs, int num) {
		int nums = num;
		Character key = null;
		int value = 0;
		int i =0;
		while(nums>0){
			key = (Character) cs.keySet().toArray()[i];
			value = cs.get(key);
			i++;
			nums = nums-value;
		}
		if(value == 1){
			cs.remove(key);
		}else{
			cs.put(key, value-1);
		}
		return key;
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
