class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0,cnt=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                cnt++;
                ans=Math.max(ans,cnt);
            }
            else {
                cnt=0;
            }
        }
        return ans;
    }
}