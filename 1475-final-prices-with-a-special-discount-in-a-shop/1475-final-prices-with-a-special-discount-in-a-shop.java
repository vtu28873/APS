import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = prices.clone();
        // Stack stores indices of elements waiting for a discount
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            // Apply discount to previous items that are >= current item's price
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int prevIndex = stack.pop();
                answer[prevIndex] -= prices[i];
            }
            stack.push(i);
        }
        
        return answer;
    }
}