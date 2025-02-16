class Solution {
    public int[] constructDistancedSequence(int n) {
        boolean[] used = new boolean[n+1];
        int[] res = new int[2*n-1];
        Func(0, res, used, n);
        return res;
    }
    public boolean Func(int index, int[] res, boolean[] used, int n){
        while(index<res.length && res[index]!=0){
            index =  index + 1;
        } 
        if(index==res.length){
            return true;
        }
        for(int i = n; i > 0; i--){
            if(used[i]==true){
                continue;
            }
            if(i==1){
                res[index] = i;
                used[i] = true;
                if(Func(index+1, res, used, n)){
                    return true;
                }
                res[index] = 0;
                used[i] = false;
            } else if(index+i<res.length && res[index+i]==0){
                res[index+i] = i;
                res[index] = i;
                used[i] = true;
                if(Func(index+1, res, used, n)){
                    return true;
                }
                res[index+i] = 0;
                res[index] = 0;
                used[i] = false;
            }
        }
        return false;
    }
}