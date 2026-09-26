class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, '*'); // Temporary marker for invalid ')'
                }
            }
        }
        
        // Mark all remaining unmatched '('
        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }
        
        // Rebuild result excluding marked characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }
        
        return result.toString();
    }
}