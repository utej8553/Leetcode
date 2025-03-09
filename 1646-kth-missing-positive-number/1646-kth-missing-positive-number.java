import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> l = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        for (int num : arr) {
            temp.add(num);
        }
        
        for (int i = 1; l.size() < k; i++) {
            if (!temp.contains(i)) {
                l.add(i);
            }
        }
        
        return l.get(k - 1);
    }
}
