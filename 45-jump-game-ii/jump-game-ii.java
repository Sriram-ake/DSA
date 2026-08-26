class Solution {
    public int jump(int[] nums) {
        int a = 0; 
        int b = 0;
        int c = 0; 
        for (int i = 0; i < nums.length - 1; i++) {
            c = Math.max(c, i + nums[i]);
            if (i == b) {
                a++;
                b = c;
            }
        }
        return a;
    }
}