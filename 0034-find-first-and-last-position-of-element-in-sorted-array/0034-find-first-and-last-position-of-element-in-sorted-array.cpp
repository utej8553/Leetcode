class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
    vector<int> n = {-1,-1};
    bool b = false;
    for(int i = 0; i < nums.size(); i++){
        if(nums[i]==target && b==false){
            n[0] = i;
            b = true;
        } if(nums[i]==target &&b==true){
            n[1] = i;
        }
    }
    return n;

    }
};