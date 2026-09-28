import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int ast : asteroids) {
            boolean destroyed = false;
            
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                if (Math.abs(ast) > stack.peek()) {
                    stack.pop(); // Top asteroid explodes
                } else if (Math.abs(ast) == stack.peek()) {
                    stack.pop(); // Both explode
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // Current asteroid explodes
                    break;
                }
            }
            
            if (!destroyed) {
                stack.push(ast);
            }
        }
        
        // Convert stack to array (in original order)
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}