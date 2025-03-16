class Solution {
    public long repairCars(int[] ranks, int cars) {
        long start = Integer.MAX_VALUE;
        long end = Integer.MIN_VALUE;
        for(int num: ranks){
            end = Math.max(end, num);
            start = Math.min(start, num);
        }
        end = end*cars*cars;
        long ans = 0;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(Func(mid, ranks, cars)){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean Func(Long mid, int[] rank, int cars){
        long r = 0;
        for(int num: rank){
            r = r + (long)(Math.sqrt((1.0*mid)/num));
            if(r>=cars){
                return true;
            }
        }
        return false;
    }
}