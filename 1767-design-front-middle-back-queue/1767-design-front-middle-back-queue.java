class FrontMiddleBackQueue {
    List<Integer> l;

    public FrontMiddleBackQueue() {
        l = new ArrayList<>();
    }

    public void pushFront(int val) {
        l.add(0, val);
    }

    public void pushMiddle(int val) {
        int m = l.size() / 2;
        l.add(m, val);
    }

    public void pushBack(int val) {
        l.add(val);
    }

    public int popFront() {
        if (l.isEmpty()) return -1;
        int temp = l.get(0);
        l.remove(0);
        return temp;
    }

    public int popMiddle() {
        if (l.isEmpty()) return -1;
        int m = l.size() / 2;
        if (l.size() % 2 == 0) m--;
        int temp = l.get(m);
        l.remove(m);
        return temp;
    }

    public int popBack() {
        if (l.isEmpty()) return -1;
        int temp = l.get(l.size() - 1);
        l.remove(l.size() - 1);
        return temp;
    }
}
