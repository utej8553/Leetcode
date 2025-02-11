class Solution {
    public String removeOccurrences(String s, String part) {
        
        while(true){
            if(s.contains(part)){
                int idx = s.indexOf(part);
                int start = idx;
                int end = idx + part.length();
                s = s.substring(0, start) + s.substring(end);
            }
            if(!s.contains(part)){
                break;
            }
        }
        return s;
    }
}