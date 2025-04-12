class Solution {
    public int subtractProductAndSum(int n) {
        int prod = Func1(n);
        int sum = Func2(n);
        return prod-sum;
    }
    public int Func1(int n){
        int prod = 1;
        while(n!=0){
            prod = prod * (n%10);
            n = n/10;
        }
        return prod;
    }
    public int Func2(int n){
        int prod = 0;
        while(n!=0){
            prod = prod + (n%10);
            n = n/10;
        }
        return prod;
    }
}