package dupe;

public class Triples {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5 };
		System.out.println(Triples.findSingle(nums));
	}

	static int findSingle(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[i++] && nums[i] != nums[i--]) {
				return (int) nums[i];
			}
		}
		return 3;
	}
}
