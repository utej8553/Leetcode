class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        if (words.length == 0) return res;
        char[] chars = words[0].toCharArray();
        Arrays.sort(chars);
        String sort = new String(chars);
        res.add(words[0]);
        for(int i = 0; i < words.length; i++){
            chars = words[i].toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            if(!sort.equals(temp)){
                sort = temp;
                res.add(words[i]);
            }
        }
        return res;
    }
}