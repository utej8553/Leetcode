class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for (int num : nums) {
            list.add(new int[]{num, freqMap.get(num)});
        }

        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] != b[1]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i)[0];
        }
        return nums;
    }
}