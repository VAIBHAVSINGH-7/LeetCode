class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create an auxiliary array to hold the merged result
        int[] tmp = new int[m + n];
        int p = 0, q = 0;
        int it = 0;

        // Compare elements from the front of both arrays
        while (p < m && q < n) {
            if (nums1[p] <= nums2[q]) {
                tmp[it++] = nums1[p++];
            } else {
                tmp[it++] = nums2[q++];
            }
        }

        // Copy remaining elements of nums1, if any
        while (p < m) {
            tmp[it++] = nums1[p++];
        }

        // Copy remaining elements of nums2, if any
        while (q < n) {
            tmp[it++] = nums2[q++];
        }

        // Copy the merged result back into nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = tmp[i];
        }
    }
}