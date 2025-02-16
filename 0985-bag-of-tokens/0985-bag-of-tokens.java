class Solution {
    public int bagOfTokensScore(int[] arr, int power) {
        Arrays.sort(arr);
        int low = 0;
        int right = arr.length-1;
        int score = 0;
        while(low<=right){
            if(power>=arr[low]){
                power = power - arr[low];
                score = score + 1;
                low = low + 1;
            } else if(low<right && score>0){
                score = score - 1;
                power = power + arr[right];
                right = right - 1;
            } else {
                return score;
            }
        }
        return score;
    }
}