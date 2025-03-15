class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        while(left<=right){
            int mid = (left+right)/2;
            int hours = 0;
            for(int j = 0; j < piles.length; j++){
                hours = hours + (piles[j] + mid - 1) / mid;
            }
            if(hours<=h){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}