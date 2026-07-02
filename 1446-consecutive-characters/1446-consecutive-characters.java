class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = Integer.MIN_VALUE;

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                if (max < count) {
                    max = count;
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (max < count) {
            max = count;
        }
        return max;
    }
}