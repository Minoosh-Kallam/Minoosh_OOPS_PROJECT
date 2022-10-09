import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static String findLargestNumber(String []nums , int n) {
		StringBuilder ans = new StringBuilder() ;
		
		Arrays.sort(nums , (a , b) -> {
			return (a+b).compareTo(b+a) ;
		});
		
		
		for(int i= n-1;i>=0;i--) {
			ans.append(nums[i]);
		}
		
		return ans.toString() ;
	}

	public static void main(String []args) {
		int n ;
		String []nums;
		System.out.println("Enter no.of numbers");
		Scanner sc = new Scanner(System.in) ;
		
		n = sc.nextInt() ;
		nums = new String[n];
		sc.nextLine();
		System.out.println("Enter elements (seperated by new line)");

		
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextLine() ;
		}
		
		
		System.out.println(findLargestNumber(nums , n) );
		
	}
}
