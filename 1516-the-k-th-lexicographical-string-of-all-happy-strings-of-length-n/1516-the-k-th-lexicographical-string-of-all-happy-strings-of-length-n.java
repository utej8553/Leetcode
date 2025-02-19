class Solution {
    private String res = "";
    private int perm = 0;

    public String getHappyString(int n, int k) {
        Func(n, 0, k, new StringBuilder(), "abc");
        return res;
    }

    public void Func(int size, int index, int k, StringBuilder str, String s) {
        if (index == size) {
            perm++;
            if (perm == k) {
                res = str.toString();
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (str.length() == 0 || str.charAt(str.length() - 1) != s.charAt(i)) {
                str.append(s.charAt(i));
                Func(size, index + 1, k, str, s);
                str.deleteCharAt(str.length() - 1);
                if (!res.isEmpty()) return;
            }
        }
    }
}
