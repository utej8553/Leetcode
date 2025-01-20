import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        
        k--; 
        StringBuilder result = new StringBuilder();
        
        for (int i = n; i > 0; i--) {
            int index = k / factorial;
            result.append(nums.get(index));
            nums.remove(index);
            if (i > 1) {
                k %= factorial;
                factorial /= (i - 1);
            }
        }
        
        return result.toString();
    }
}
