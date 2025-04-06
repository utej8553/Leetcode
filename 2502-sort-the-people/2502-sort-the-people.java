class Solution {
    public String[] sortPeople(String[] a, int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    String temp1 = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp1;
                }
            }
        }
        return a;
    }
}