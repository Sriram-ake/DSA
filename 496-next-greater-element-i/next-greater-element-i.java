class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length && nums2[j] != nums1[i]) {
                j++;
            }
            j++;
            while (j < nums2.length && nums2[j] <= nums1[i]) {
                j++;
            }
            if (j < nums2.length) {
                ans[i] = nums2[j];
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}