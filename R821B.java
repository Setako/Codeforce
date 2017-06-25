import java.util.Scanner;

public class R821B {
    static Scanner in = new Scanner(System.in);
    static long m = 0;
    static long b = 0;
	public static void solve(){
		m = in.nextLong();
		b = in.nextLong();
		
		long max = 0;
		for(long y=0;y<=b;y++){
			long x = -y*m+b*m;
			long c = cal(x, y);
			if(c>max){
				max=c;
			}
		}
		
		System.out.println(max);
	}
	
	public static long cal(long x,long y){
		return ((0+x)*(x+1)/2)*(y+1) + (x+1)*(1+y)*y/2;
	}
	
	public static void main(String args[]) {
		solve();
	}
}
