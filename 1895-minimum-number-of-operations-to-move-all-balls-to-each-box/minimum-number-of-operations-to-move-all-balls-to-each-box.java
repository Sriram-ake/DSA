class Solution {
    public int[] minOperations(String boxes) {
        //without using the prefix sum method is equals to brut force method
        int[] nums=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++) {
            for(int j=0;j<boxes.length();j++) {
                if(boxes.charAt(i)=='1') nums[j]+=Math.abs(i-j);
            }
        }
        return nums;
    }
}