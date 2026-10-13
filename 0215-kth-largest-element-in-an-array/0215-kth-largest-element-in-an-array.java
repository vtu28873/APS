import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Min-heap to keep track of the k largest elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : nums) {
            pq.offer(x);
            // Maintain a heap size of k
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // The root of the min-heap is the kth largest element
        return pq.peek();
    }
}