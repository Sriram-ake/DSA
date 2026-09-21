class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int target = tickets[k];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i <= k) {
                ans += Math.min(tickets[i], target);
            }
            if (i > k) {
                ans += Math.min(tickets[i], target - 1);
            }
        }
        return ans;
    }
}