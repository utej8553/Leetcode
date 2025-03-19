class Solution {
    private Map<String, Boolean> memo = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) return true;
        if (memo.containsKey(s)) return memo.get(s);
        for (int i = 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(0, i)) && wordBreak(s.substring(i), wordDict)) {
                memo.put(s, true);
                return true;
            }
        }

        memo.put(s, false);
        return false;
    }

}