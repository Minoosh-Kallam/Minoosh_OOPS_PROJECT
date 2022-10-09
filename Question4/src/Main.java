import java.util.Scanner;

public class Main {
	
	public static double pow(double x , int n) {
		
		if(n == 0)
			return 1;
		if(n == 1)
			return x ;
		
		double temp = x ;
		
		long iter = 1;
		while(iter*2 <= n) {
			x = x*x ;
			iter = iter*2 ;
		}
		
		if(iter == n)
			return x ;
		
		return x * pow(temp , (int)(n - iter )) ;
	}

	public static void main(String args[]) {
		double x ;
		int n ;
		
		System.out.println("Enter values of x , n");
		
		Scanner sc = new Scanner(System.in) ;
		x = sc.nextDouble() ; n = sc.nextInt() ;
		if(n < 0) {
			System.out.println(1/pow(x , -n));
			return ;
		}
		
		System.out.println(pow(x , n));
		
	}
}
