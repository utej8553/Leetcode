class NumberContainers {
    private Map<Integer, Integer> indexMap;
    private Map<Integer, TreeSet<Integer>> numMap;

    public NumberContainers() {
        indexMap = new HashMap<>();
        numMap = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexMap.containsKey(index)) {
            int oldNumber = indexMap.get(index);
            if (numMap.containsKey(oldNumber)) {
                numMap.get(oldNumber).remove(index);
                if (numMap.get(oldNumber).isEmpty()) {
                    numMap.remove(oldNumber);
                }
            }
        }
        indexMap.put(index, number);
        numMap.putIfAbsent(number, new TreeSet<>());
        numMap.get(number).add(index);
    }

    public int find(int number) {
        return numMap.containsKey(number) ? numMap.get(number).first() : -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */