// public class Solution {
//     public boolean checkPerfectNumber(int num) {
//         if (num == 1) return false;

//         int sum = 1;
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 sum += i + num / i;
//             }
//         }

//         return sum == num;
//     }
// }

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int start = num%2 == 0? 2 : 3;
        int total = 1;
        for (int i = start; i * i <= num; i +=2 ) {
            if ( num % i == 0) {
                int fac2 = num / i;
                total += i;
                if (fac2 == i) {
                    return total == num;
                } else {
                    total += fac2;
                }
            }
        }
        return total == num;
    }
}
