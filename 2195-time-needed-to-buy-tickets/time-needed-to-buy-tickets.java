class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++) {
            q.add(i);
        }
        int turns=0;
        while(tickets[k]>0) {
            int front=q.remove();
            tickets[front]-=1;
            turns++;
            if(tickets[front] > 0) q.add(front) ;
        }
        return turns;
    }
}