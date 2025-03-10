class Solution {
    public long countOfSubstrings(String word, int k) {
        return Func(k, word) - Func(k + 1, word);
    }

    private boolean isCon(char ch) {
        return !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    private boolean isAll(int[] freq) {
        return (freq['a' - 'a'] > 0 && freq['e' - 'a'] > 0 && freq['i' - 'a'] > 0
                && freq['o' - 'a'] > 0 && freq['u' - 'a'] > 0);
    }

    private long Func(int k, String word) {
        long count = 0;
        int curCon = 0;
        int freq[] = new int[26];
        int n = word.length();
        int left = 0;

        for (int right = 0; right < n; right++) {
            char ch = word.charAt(right);
            if (isCon(ch)) {
                curCon++;
            }
            freq[ch - 'a']++;

            while (curCon >= k && isAll(freq)) {
                count += (n - right);
                char c = word.charAt(left);
                if (isCon(c)) {
                    curCon--;
                }
                freq[c - 'a']--; 
                left++;
            }
        }
        return count;
    }
}
