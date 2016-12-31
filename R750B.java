import java.util.HashMap;
import java.util.Scanner;

public class R750B {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		boolean ok = true;
		int n = in.nextInt();
		in.nextLine();
		int y =0;
		for(int i = 0;i<n;i++){
			int ay = in.nextInt();
			String s = in.nextLine();
			if(s.equals(" South")){
				y = y+ay;
				if(y >20000||y<0){
					ok = false;
				}
			}
			else if(s.equals(" North")){
				y =y-ay;
				if(y >20000||y<0){
					ok = false;
				}
			}else if(y == 20000||y == 0){
				ok = false;
			}
		}
		if(y!=0||ok==false){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
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
