class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0;
        int zeroes = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i]==1){
                ones++; 
            } else {
                zeroes++;
            }
        }
        for(int i = 0; i < sandwiches.length; i++){
            if(ones==0 && sandwiches[i]==1){
                return zeroes;
            } else if(zeroes==0 && sandwiches[i]==0){
                return ones;
            }
            if(sandwiches[i]==0){
                zeroes--;
            } else {
                ones--;
            }
        }
        return 0;
    }
}