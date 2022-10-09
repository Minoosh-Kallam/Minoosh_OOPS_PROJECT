import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array , target (sperated by space)");
		int n = sc.nextInt() ;
		int target = sc.nextInt() ;
		
		int []nums = new int[n];
		System.out.println("Enter array elements (seperated by space or new line)");
		
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt() ;
		}
		
		
		System.out.println(findPair(nums , n , target));
		
	}

	public static String findPair(int[] nums, int n, int target) {
		
		if(n <= 1)
			return "No pair of elemets found that match up to "+target ;
		
		int left =0 , right = n -1 ;
		while(left < right) {
			int pairSum = nums[left]+nums[right] ;
			
			if(pairSum == target)
				return "["+left+","+right+"], nums["+left+"] + nums["+right+"] = "+target+"." ;
			
			else if(pairSum > target)
				right --;
			else
				left++ ;
		}
		return "No pair of elemets found that match up to "+target ;
	}
}
