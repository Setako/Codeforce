import java.util.HashMap;
import java.util.Scanner;

public class R725A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int n= in.nextInt();
		in.nextLine();
		char[] arr = in.nextLine().toCharArray();
		int ans = 0;
		if(arr[0] == '<'){
			for(int i = 0;i<n;i++)
			{
				if(arr[i] =='<')
				{
					ans++;
				}
				else{
					break;
				}
			}
		}
		if(arr[n-1] == '>'){
			for(int i = n-1;i>=0;i--)
			{
				if(arr[i] =='>')
				{
					ans++;
				}
				else{
					break;
				}
			}
		}
			System.out.println(ans);
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
