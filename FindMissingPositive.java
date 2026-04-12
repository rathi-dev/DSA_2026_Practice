public class FindMissingPositive {

	public static int firstMissingPositive(int[] nums) {

		int k = 1;
		while (isPresent(nums, k)) {
			k++;
		}
		return k;
	}

	static boolean isPresent(int[] nums, int k) {

		boolean found = false;
		for (int num : nums) {
			if (num == k) {
				found = true;
			}
		}
		//System.out.println("finding k" + k + "returning" + found);
		return found;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 3, 5 };
		System.out.println(firstMissingPositive(nums));
	}

}