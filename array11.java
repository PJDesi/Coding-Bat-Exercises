/*

Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0. 

array11({1, 2, 11}, 0) → 1
array11({11, 11}, 0) → 2
array11({1, 2, 3, 4}, 0) → 0

*/

public class array11 {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,11,1,11,11,1011};
		System.out.println(array11(new int[]{1,11,11,11,11}, 0 ));
		System.out.println(array11(nums, 0));
	}

	public static int array11(int[] nums, int index) {
		//Base Case: if index reaches end of nums array
		if (nums.length == index) {
			return 0;
		}

		//Recursive Cases:
		else if (nums[index] == 11) {
			return 1 + array11(nums, index+1);
		}

		else
			return array11(nums, index+1);
	}

}