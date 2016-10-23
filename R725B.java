import java.util.HashMap;
import java.util.Scanner;
/**
 * Unsolved
 */
public class R725B {
    static Scanner in = new Scanner(System.in);
    @SuppressWarnings("unchecked")
	static HashMap<Character, Integer> map =  charOrderMap(new HashMap<>(), "fedabc", 1, true);
	public static void solve(){
		String arr = in.nextLine();
		long r = Long.parseLong(arr.substring(0, arr.length()-1));
		int s = map.get(arr.substring(arr.length()-1).toCharArray()[0]);
		long ans = s;
		if(r%4 == 0 ||r%4 == 2)
		{
			ans = ans+7;
		}
		ans = (Math.round(Math.floor((r-1)/4)))*16+ans;
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
}
