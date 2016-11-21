import java.util.HashMap;
import java.util.Scanner;

public class R738A {
    static Scanner in = new Scanner(System.in);
	public static void solve(){
		int n = in.nextInt();
		in.nextLine();
		char[] arr = in.nextLine().toCharArray();
		boolean sg = false;
		boolean ino = false;
		int total = 0;
		int inostart = 0;
		for(int i = 0; i< arr.length;i++){
			if(!ino){
				if(arr[i] == 'o')
				{
					ino = true;
					inostart = i;
					sg = true;
					total = 1;
				}
			}
			else{
				if(sg){
					if(arr[i] == 'g' ){
						sg = false;
					}
					else{
						if(total >=3)
						{
							replace(arr, inostart, total);
							ino = false;
							sg = false;
						}
						
						if(arr[i] == 'o')
						{
							ino = true;
							inostart = i;
							sg = true;
							total =1;
						}
					}
				}
				else{
					if(arr[i] == 'o' ){
						total = total +2 ;
						sg = true;
					}
					else{
						if(total >=3)
						{
							replace(arr, inostart, total);
						}
						ino = false;
					}
				}
				
			}
		}
		if(ino&&total >=3){
			replace(arr, inostart, total);
		}
		
		String reslut = "";
		for(int i = 0;i< arr.length;i++)
		{
			if(arr[i]!='\u0000')
			{
			reslut = reslut + arr[i];
			}
		}
		System.out.println(reslut);
	}
	
	public static void replace(char[] arr,int start,int total){
		int x=3;
		for(int i = start; i<arr.length;i++){
			if(total<=0)
			{
				break;
			}
			arr[i] = '*';
			if(x<=0){
				arr[i] = '\u0000';
			}
			x--;
			total--;
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
