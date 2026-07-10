class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right) {

            // Top Row
            for(int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // Right Column
            for(int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Bottom Row
            if(top <= bottom) {

                for(int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Left Column
            if(left <= right) {

                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}