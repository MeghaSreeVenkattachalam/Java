Move all zeros to the right end int the same array.

CODE:
  
import java.util.*;
class Move_Zeros{
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        while(j<nums.length){
            nums[j++] = 0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		moveZeroes(nums);
	}
}

OUTPUT:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Input: nums = [0]
Output: [0]
