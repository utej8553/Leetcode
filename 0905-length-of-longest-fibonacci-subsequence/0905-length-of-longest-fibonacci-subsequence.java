class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer> s = new HashSet<>();
        for(int num : arr){
            s.add(num);
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int prev = arr[j];
                int curr = arr[i]+arr[j];
                int len = 2;
                while(s.contains(curr)){
                    int temp = curr;
                    curr = curr + prev;
                    prev = temp;
                    res = Math.max(res, ++len);
                }
            }
        }
        return res;
    }
}