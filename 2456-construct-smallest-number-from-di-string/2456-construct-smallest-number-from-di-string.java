class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder res = new StringBuilder();
        boolean[] used = new boolean[10];
        backtrack(pattern, res, used, 0);
        return res.toString();
    }

    public boolean backtrack(String pat, StringBuilder res, boolean[] used, int index) {
        if (res.length() == pat.length() + 1) {
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if (!used[i]) {
                if (res.length() == 0 ||
                        (pat.charAt(res.length() - 1) == 'I' && i > Character.getNumericValue(res.charAt(res.length() - 1)))||(pat.charAt(res.length() - 1) == 'D' && i < Character.getNumericValue(res.charAt(res.length() - 1)))) {

                    res.append((char) ('0' + i));
                    used[i] = true;

                    if (backtrack(pat, res, used, index + 1)) {
                        return true;
                    }

                    res.deleteCharAt(res.length() - 1);
                    used[i] = false;
                }
            }
        }
        return false;
    }
}
