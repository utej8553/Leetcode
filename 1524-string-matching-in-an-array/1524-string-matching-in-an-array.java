class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> s = new HashSet<>();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(i!=j&&words[j].contains(words[i])) {
                    s.add(words[i]);
                }
            }
        }
        List<String> l = new ArrayList(s);
        return l;
    }
}