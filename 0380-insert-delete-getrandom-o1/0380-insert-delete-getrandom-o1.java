class RandomizedSet {
    List<Integer>l;
    HashMap<Integer, Integer> map;
    Random rand;

    public RandomizedSet() {
        l = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        } else {
            map.put(val,l.size());
            l.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        } else {
            int idx = map.get(val);
            l.set(idx, l.get(l.size() - 1));
            map.put(l.get(l.size()-1), idx);
            map.remove(val);
            l.remove(l.size()-1);
            return true;
        }
    }
    
    public int getRandom() {
        return l.get(rand.nextInt(l.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */