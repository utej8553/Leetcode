class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0; i < spells.length; i++){
            int ans = 0;
            int l = 0, r = potions.length-1;
            while(l<=r){
                int mid = l + (r-l)/2;
                long temp = (long)spells[i] * potions[mid];
                if(temp>=success){
                    r = mid-1;
                } else{
                    l = mid+1;
                }
            }
            ans = potions.length-l;
            res[i] = ans;
        }
        return res;
    }
} 