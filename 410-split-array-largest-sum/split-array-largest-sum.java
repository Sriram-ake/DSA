class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        int left = 0;
        for (int num : nums) {
            left = Math.max(left, num);
        }
        int right = prefix[n];
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            int parts = 1;
            for (int num : nums) {
                if (sum + num <= mid) {
                    sum += num;
                } else {
                    parts++;
                    sum = num;
                }
            }
            if (parts <= k)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}