import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class R732C {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		Long[] i = new Long[]{in.nextLong(),in.nextLong(),in.nextLong()};
		Arrays.sort(i);
		if(i[1].equals(i[2])&&i[2].equals(i[0]))
		{
			System.out.println(0);
			return;
		}
		if(i[1].equals(i[2]))
		{
			i[1] = i[1]-1;
			i[2]=i[2]-1;
		}
		else{
			i[2] = i[2] -1;
		}
		System.out.println((i[2]-i[1])+i[2]-i[0]);
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
