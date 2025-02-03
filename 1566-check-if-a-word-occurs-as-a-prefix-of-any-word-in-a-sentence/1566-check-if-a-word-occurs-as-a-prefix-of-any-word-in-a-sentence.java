class Solution {
    public int isPrefixOfWord(String sentence, String sea) {
        List<String> l = Arrays.asList(sentence.split(" "));

    
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).startsWith(sea)) {
                return i + 1;
            }
        }

        return -1;
    }
}
