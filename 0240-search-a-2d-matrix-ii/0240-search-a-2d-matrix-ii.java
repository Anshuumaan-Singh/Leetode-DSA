class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = 0, c = arr[0].length-1;
        while(m<arr.length && c>=0){
            if(arr[m][c] == target){
                return true;
            }
            else if(arr[m][c]>target){
                c--;
            }
            else{
                m++;
            }
        }
        return false;
    }
}