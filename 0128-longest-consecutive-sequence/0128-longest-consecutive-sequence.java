class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 0;
                while(set.contains(current)){
                    current++;
                    count++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}