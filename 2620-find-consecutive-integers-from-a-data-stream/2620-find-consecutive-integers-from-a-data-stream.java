class DataStream {
    int count;
    int k;
    int val;

    public DataStream(int value, int k) {
        this.k = k;
        this.val = value;
        this.count = 0;
    }
    
    public boolean consec(int num) {
        if (num == val) count++;
        else count = 0;
        return count >= k;
    }
}
