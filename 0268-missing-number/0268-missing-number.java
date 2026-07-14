class Solution {

    public int missingNumber(int[] nums) {

        for(int i = 0; i <= nums.length; i++) {

            // Har number ke liye reset karo
            boolean found = false;

            for(int j = 0; j < nums.length; j++) {

                if(nums[j] == i) {

                    found = true;
                    break;
                }
            }

            // Number nahi mila
            if(found == false) {

                return i;
            }
        }

        return -1;
    }
}