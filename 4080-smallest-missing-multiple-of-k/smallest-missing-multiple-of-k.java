class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) {
            set.add(num);
        }
        int sum=k;
        while(set.contains(sum)) {
            sum+=k;
        }
        return sum;
    }
}