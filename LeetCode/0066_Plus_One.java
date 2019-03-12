class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}

// class Solution {
//     public int[] plusOne(int[] digits) {
//         int i = digits.length - 1;
//         int digit = digits[i] + 1;
//         digits[i] = digit % 10;
//         int carry = digit / 10;
//         i--;
//         while(carry == 1 && i >= 0)
//         {
//             digit = digits[i] + 1;
//             digits[i] = digit % 10;
//             carry = digit / 10;
//             i--;
//         }

//         if(carry == 1 && i < 0)
//             return powerOfTenArr(digits.length);

//         return digits;
//     }

//     private int[] powerOfTenArr(int pow)
//     {
//         if(pow < 1)
//             return null;

//         int[] tens = new int[pow + 1];
//         tens[0] = 1;
//         for(int i = 1; i < tens.length; i++)
//         {
//             tens[i] = 0;
//         }

//         return tens;
//     }
// }
