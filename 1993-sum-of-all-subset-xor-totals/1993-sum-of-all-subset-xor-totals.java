class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), l);
        int sum = 0;
        for(int i = 0; i < l.size(); i++){
            sum = sum + Func(l.get(i));
        }
        return sum;
    }
    private static void backtrack(int index, int[] array, List<Integer> current, List<List<Integer>> result) {
        if (index == array.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(array[index]);
        backtrack(index + 1, array, current, result);
        current.remove(current.size() - 1);
        backtrack(index + 1, array, current, result);
    }
    public int Func(List<Integer> l){
        if (l.isEmpty()) return 0;
        int sum = l.get(0);
        for(int i = 1; i < l.size(); i++){
            sum = sum ^ l.get(i);
        }
        return sum;
    }

}