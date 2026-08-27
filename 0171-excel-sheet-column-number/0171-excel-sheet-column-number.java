class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int p = 0;
        int n = columnTitle.length();

        for (int i = n - 1; i >= 0; i--) {
            int tmp = columnTitle.charAt(i) - 'A' + 1; // 'A' + 1 is cleaner than 64
            sum += tmp * Math.pow(26, p);
            p++;
        }

        return sum;
    }
}