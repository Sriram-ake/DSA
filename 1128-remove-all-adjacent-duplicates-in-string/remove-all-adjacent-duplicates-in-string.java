class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = stack.length();
            if (n > 0 && stack.charAt(n - 1) == c) {
                stack.deleteCharAt(n - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}