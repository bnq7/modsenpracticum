public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int k = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums [j] == k) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        assert result != null;
        System.out.println(result[0] + " " + result[1]);
    }
}
