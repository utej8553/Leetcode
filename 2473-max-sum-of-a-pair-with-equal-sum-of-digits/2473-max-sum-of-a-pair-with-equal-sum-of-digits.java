class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sum = Add(nums[i]);
            if(map.containsKey(sum)){
                List<Integer> l = map.get(sum);
                l.add(nums[i]);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                map.put(sum, l);
            }
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;
        for (List<Integer> value : map.values()) {
            max = Math.max(Func(value), max);
        }
        return max;
    }
    public int Add(int num){
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
    public int Func(List<Integer> l){
        if(l.size()==1||l.size()==0){
            return -1;
        } else if(l.size()==2){
            return l.get(0)+l.get(1);
        }
        
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i = 0; i < l.size(); i++){
            int temp = l.get(i);
            if(temp>max){
                secmax = max;
                max = l.get(i);
            } else if(temp>secmax){
                secmax = temp;
            }
        }
        return max + secmax;
    }
}