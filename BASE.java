import java.util.HashMap;
import java.util.Scanner;

public class BASE {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashMap charOrderMap(HashMap inputMap,String orderingString,int startFrom,boolean charAsKey){
		char[] chars = orderingString.toCharArray();
		if(charAsKey){
			for(int i = 0;i< chars.length;i++){
				inputMap.put(chars[i], i);
			}
		}
		else{
			for(int i = 0;i< chars.length;i++){
				inputMap.put(i, chars[i]);
			}
		}
		return inputMap;
	}
	
	public static void main(String args[]) {
		solve();
	}
}
