class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length, m = nums2.length;
        int[][] result = new int[n + m][2];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i][0] == nums2[j][0]) {
                result[k++] = new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]};
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < n) result[k++] = nums1[i++];
        while (j < m) result[k++] = nums2[j++];

        int[][] finalResult = new int[k][2];
        System.arraycopy(result, 0, finalResult, 0, k);
        return finalResult;
    }
}
