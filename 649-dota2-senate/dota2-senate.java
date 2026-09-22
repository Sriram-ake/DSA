class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> r = new ArrayDeque<>();
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                r.add(i);
            } else {
                d.add(i);
            }
        }
        int n = senate.length();
        while (!r.isEmpty() && !d.isEmpty()) {
            if (r.peek() < d.peek()) {
                d.poll();
                r.add(r.poll() + n);
            } else {
                r.poll();
                d.add(d.poll() + n);
            }
        }
        if (d.isEmpty()) {
            return "Radiant";
        } else {
            return "Dire";
        }
    }
}