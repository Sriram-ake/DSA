class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                st.pop();
            } 
            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } 
            else if (op.equals("+")) {
                st.push(st.get(st.size() - 1) + st.get(st.size() - 2));
            } 
            else {
                st.push(Integer.parseInt(op));
            }
        }
        int total = 0;
        while (!st.isEmpty()) {
            total += st.pop();
        }
        return total;
    }
}