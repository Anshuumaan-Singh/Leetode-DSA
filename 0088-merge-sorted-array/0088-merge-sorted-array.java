class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
        int [] crr = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(arr[i]<brr[j]){
                crr[k++] = arr[i++];
            }
            else{
                crr[k++] = brr[j++];
            }
        }
        while(i<m){
            crr[k++] = arr[i++];
        }
        while(j<n){
            crr[k++] = brr[j++];
        }
        for(int l = 0; l<arr.length; l++){
            arr[l] = crr[l];
        }
    }
} 