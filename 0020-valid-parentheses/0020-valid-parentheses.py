class Solution:
    def isValid(self, s: str) -> bool:
        l = []
        for i in range(0, len(s)):
            ch = s[i]
            if (ch==')' and len(l) > 0 and l[-1]=='('):
                l.pop()
            elif (ch=='}' and len(l) > 0 and l[-1]=='{'):
                l.pop()
            elif (ch==']' and len(l) > 0 and l[-1]=='['):
                l.pop()
            else :
                l.append(ch)
        
        if len(l)==0:
            return True
        else:
            return False