class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 :
            return False
        
        rev = 0
        temp = x
        while x>0:
            rem = x%10
            rev = rev*10+rem
            x = x//10

        print(rev)
        if temp==rev:
            return True
        else:
            return False
            