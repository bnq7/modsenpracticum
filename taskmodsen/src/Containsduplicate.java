public class ContainsDuplicate {
    public static boolean containsDuplicate(int []nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums1 = {1,2,2,4,5,6,7,8,9};
        int []nums2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
    }
}
