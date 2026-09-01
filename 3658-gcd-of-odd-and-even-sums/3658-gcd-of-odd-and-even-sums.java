class Solution {
    public int gcdOfOddEvenSums(int n) {
        int i = 1;
        int sumEven = 0;
        int sumOdd = 0;
        while(i<=(2*n)){
            if(i%2==0){
            sumEven+=i;
            }
            else{
            sumOdd+=i;
            }
            i++;
        }
        while(sumOdd!=0){
            int old = sumOdd;
            sumOdd = sumEven%sumOdd;
            sumEven = old;
        }
        return sumEven;
    }
}