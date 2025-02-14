class MyCircularQueue {
    Deque<Integer> q;
    int size;

    public MyCircularQueue(int k) {
        q = new ArrayDeque<>();
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(q.size()==size){
            return false;
        } else {
            q.offerLast(value);
            return true;
        }
    }
    
    public boolean deQueue() {
        if(q.size()==0){
            return false;
        } else {
            q.pollFirst();
            return true;
        }
    }
    
    public int Front() {
        if(q.size()==0){
            return -1;
        } else {
            return q.peekFirst();
        }
    }
    
    public int Rear() {
        if(q.size()==0){
            return -1;
        } else {
            return q.peekLast();
        }
    }
    
    public boolean isEmpty() {
        return q.size()==0;
    }
    
    public boolean isFull() {
        return q.size()==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */