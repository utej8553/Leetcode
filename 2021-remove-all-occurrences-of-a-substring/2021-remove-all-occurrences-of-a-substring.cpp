class Solution {
public:
    string removeOccurrences(string s, string part) {
        
        
        while(true){
            if(s.find(part)==string::npos){
                break;
            } else{
                int idx = s.find(part);
                s.erase(idx, part.length());
            }
        }
        return s;
    }
};