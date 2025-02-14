class ProductOfNumbers {
    List<Integer> l;

    public ProductOfNumbers() {
        l = new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1;
        int size = l.size();
        for(int i = 0; i < k; i++){
            prod = prod * l.get(size-1-i);
        }   
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */