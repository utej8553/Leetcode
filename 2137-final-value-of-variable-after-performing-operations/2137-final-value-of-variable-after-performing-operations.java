class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("+")){
                res++;
            } else{
                res--;
            }
        }
        return res;
    }
}