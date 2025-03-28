class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        String v = "aeiouAEIOU";
        List<Character> l = new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            String temp = String.valueOf(s.charAt(i));
            if(v.contains(temp)){
                sb.append('-');
                l.add(s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
        }
        Collections.sort(l);
        int a = 0;
        String temp = String.valueOf(sb);
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i)=='-'){
                char ch = l.get(a);
                a++;
                sb.setCharAt(i, ch);
            }
        }
        return String.valueOf(sb);
    }
}