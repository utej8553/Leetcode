class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }
        if(s1.length() != s2.length()){
            return false;
        }

        // Track differing indices
        int f = -1, s = -1;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) {
                if(f == -1) {
                    f = i;
                } else if(s == -1) {
                    s = i;
                } else{
                    return false;
                }
            }
        }

        return (f!=-1&&s!=-1)&&func(s1, s2, f, s);
    }

    public boolean func(String s1, String s2, int f, int s) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        
        // Swap characters in a1
        char temp = a1[f];
        a1[f] = a1[s];
        a1[s] = temp;

        // Compare the modified a1 with a2
        return new String(a1).equals(new String(a2));
    }
}
