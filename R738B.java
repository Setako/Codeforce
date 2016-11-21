import java.util.HashMap;
import java.util.Scanner;

public class R738B {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int ni = in.nextInt();
		int mi = in.nextInt();
		in.nextLine();
		String[] line = new String[ni];
		for(int n = 0;n<ni;n++){
			line[n] = in.nextLine();
		}
		boolean [][] arr = new boolean[ni][mi];
		for(int n = 0;n<ni;n++){
			String[] c = line[n].split(" ");
			for(int m = 0;m<mi;m++){
				if(c[m].equals("1")){
					arr[n][m] = true;
				}
				else{
					arr[n][m] = false;
				}
			}
		}
		int total = 0;
		for(int n = 0;n<ni;n++)
		{
			int multi = 1;
			int counting =0;
			for(int m = 0;m<mi;m++)
			{
				if(arr[n][m]){
					if(counting>0){
						total = total + multi * counting;
					}
					counting = 0;
					multi = 2;
				}else{
					counting++;
				}
			}
			if(multi==2){
				total = total + counting;
			}			
		}
		
		for(int m = 0;m<mi;m++)
		{
			int multi = 1;
			int counting =0;
			for(int n = 0;n<ni;n++)
			{
				if(arr[n][m]){
					if(counting>0){
						total = total + multi * counting;
					}
					counting = 0;
					multi = 2;
				}else{
					counting++;
				}
			}
			if(multi==2){
				total = total + counting;
			}			
		}
		
		System.out.println(total+"");
		
		
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
