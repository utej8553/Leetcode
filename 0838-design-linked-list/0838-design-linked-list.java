class MyLinkedList {
    Deque<Integer> deque;

    public MyLinkedList() {
        deque = new ArrayDeque<>();
    }
    
    public int get(int index) {
        int i = 0;
        for(int num: deque){
            if(i==index){
                return num;
            }
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        deque.addFirst(val);
    }
    
    public void addAtTail(int val) {
        deque.addLast(val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > deque.size()){
            return;
        }
        List<Integer> l = new ArrayList<>(deque);
        l.add(index, val);
        deque = new ArrayDeque<>(l);
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=deque.size()){
            return;
        }
        List<Integer> l = new ArrayList<>(deque);
        l.remove(index);
        deque = new ArrayDeque<>(l);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */