import java.util.HashMap;
import java.util.Scanner;

public class R750C {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int n = in.nextInt();
		int[] change = new int[n+1];
		int[] div = new int[n];
		change[0] = 0;
		for(int i =0;i<n;i++){
			change[i+1] = in.nextInt();
			div[i] = in.nextInt();
		}
		
		long l=Long.MIN_VALUE + (200000*101);
		long m=Long.MAX_VALUE - (200000*101);
		long tooHigh = Long.MAX_VALUE/2;
		boolean Impossible = false;
		if(div[0] == 1){
			l = 1900;
		}else{
			m = 1899;
		}
		for(int i =1;i<n;i++){
			if(div[i] == 1){
				m = m+change[i];
				l = l+change[i];
				if(l<1900){
					l = 1900;
				}
				if(m<l){
					Impossible = true;
				}
			}
			else{
				m = m+change[i];
				l = l+change[i];
				if(m>1899){
					m=1899;
				}
				if(m<l){
					Impossible = true;
				}
			}
		}
		m = m+ change[n];
		if(Impossible){
			System.out.println("Impossible");
		}
		else if(m>tooHigh){
			System.out.println("Infinity");
		}else{
			System.out.println(m);
		}
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
