import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0; // Pointer for popped array

        for (int val : pushed) {
            stack.push(val);
            // Greedily pop elements as long as the top matches the current popped element
            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        // If all elements in popped were matched, the stack will be empty
        return stack.isEmpty();
    }
}