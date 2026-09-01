class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        // 1. Calculate the sums of the first n odd and even numbers
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        // 2. Compute GCD using the standard Euclidean Algorithm
        int a = sumOdd;
        int b = sumEven;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
// class Solution {
//     public int gcdOfOddEvenSums(int n) {
//         // int i = 1;
//         // int sumEven = 0;
//         // int sumOdd = 0;
//         // while(i<(2*n)){
//         //     if(i%2 == 0){
//         //         sumEven+=i;
//         //     }
//         //     else{
//         //         sumOdd+=i;
//         //     }
//         //     i++;
//         // }
//         // while(sumEven > 0 && sumOdd>0){
//         //     if(sumEven>sumOdd){
//         //         sumEven = sumEven%sumOdd;
//         //     }
//         //     else{
//         //         sumOdd = sumOdd%sumEven;
//         //     }
//         // }
//         // return sumOdd;
//         return n;
        
//     }
// }



