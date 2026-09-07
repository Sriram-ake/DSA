class Solution {
    public int singleNumber(int[] nums) {
         int single = 0;

        for (int arr : nums) {
            single ^= arr;
        }
         return single;
    }
}