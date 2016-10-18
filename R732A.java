import java.util.HashMap;
import java.util.Scanner;

public class R732A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int k = in.nextInt();
		int r = in.nextInt();
		
		for (int i = 1;i<=10;i++)
		{
			int c = k*i;
			char[] ch = (c+"").toCharArray();
			int last = Integer.parseInt(ch[ch.length-1]+"");
			if(last ==0||last ==r)
			{
				System.out.println(i);
				return;
			}
		}
		
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
