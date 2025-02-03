import java.util.HashMap;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Boolean> table = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(table.containsKey(2*arr[i]) || (arr[i]%2==0&&table.containsKey(arr[i]/2))){
                return true;
            }
            table.put(arr[i], true);
        }
        return false;
    }
}