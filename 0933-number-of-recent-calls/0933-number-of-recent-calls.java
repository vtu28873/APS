import java.util.ArrayDeque;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        // Add the current timestamp to the queue
        queue.add(t);
        
        // Remove timestamps outside the [t - 3000, t] range
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        
        // The remaining elements are within the valid 3000ms window
        return queue.size();
    }
}