class MyCircularQueue {
    private final int[] queue;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.head = 0;
        this.tail = -1;
        this.size = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        
        // Circularly increment tail index
        tail = (tail + 1) % capacity;
        queue[tail] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        
        // Circularly increment head index
        head = (head + 1) % capacity;
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return queue[head];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return queue[tail];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}