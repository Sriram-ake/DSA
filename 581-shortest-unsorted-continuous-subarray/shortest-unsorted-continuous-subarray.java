class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int n = nums.length;
        int i = 0, j = n - 1;
        while (i <= j) {
            if (nums[i] != sorted[i] && nums[j] != sorted[j]) break;
            if (nums[i] == sorted[i]) i++;
            if (nums[j] == sorted[j]) j--;
        }
        return (i > j) ? 0 : j - i + 1;
    }
}