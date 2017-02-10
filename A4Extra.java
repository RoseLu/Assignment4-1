
public class A4Extra {
	public static int missingNumber(int[] nums) {
		int lo = 0, hi = nums.length-1;
		while(lo <= hi) {
			int mid = lo + (hi-lo)/2;
			if(nums[mid] > mid) hi = mid - 1;
			else lo = mid + 1;
		}		
		return lo == nums.length ? -1 : lo;
	}
	
	public static void moveZeroes(int[] nums) {
        int len = nums.length;
        for(int i = 1; i < len; i++) {
        	for(int j = i; j > 0 && nums[j-1] == 0; j--) {
    			int temp = nums[j];
    			nums[j] = nums[j-1];
    			nums[j-1] = temp;
        	}
        }
	}
	
	public static int thirdMax(int[] nums) {
        return -1;
	}
	
	public static void main(String args[]) {
		int[] nums = {0, 1, 3};
	
		int ans = missingNumber(nums);
		System.out.println(ans);
		
		
		int[] nums2 = {0};
		moveZeroes(nums2);
		for(int n: nums2) System.out.print(n);
	}
}
