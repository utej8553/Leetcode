class Solution {
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String[] str = s.split(" ");
        int max = find(str);
        for(int i = 0; i < max; i++){
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < str.length; j++){
                temp.append(get(str[j], i));
            }
            res.add(trimRight(temp.toString()));
        }
        return res;
    }
    public static int find(String[] arr) {
        int maxLen = 0;
        for (String str : arr) {
            maxLen = Math.max(maxLen, str.length());
        }
        return maxLen;
    }
    public static String get(String s, int index) {
        return (index >= 0 && index < s.length()) ? String.valueOf(s.charAt(index)) : " ";
    }
    public static String trimRight(String s) {
        return s.replaceAll("\\s+$", "");
    }
}