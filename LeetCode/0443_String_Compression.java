class Solution {
    public int compress(char[] chars) {
        int anchor = 0, write = 0;

        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }
}

// class Solution {
//     public int compress(char[] chars) {
//         if(chars.length < 2) return chars.length;

//         int k = 0;
//         int count = 1;
//         char c = chars[0];

//         int i = 1;
//         while(i < chars.length){

//             if(chars[i] == c){
//                 count++;
//             }else{

//                 chars[k++] = c;
//                 if(count > 1 && count <= 9){
//                     chars[k++] = (char)(count+'0');
//                 }else if(count > 9){
//                    k = build(chars, count, k);
//                 }
//                 c = chars[i];
//                 count = 1;
//             }

//             i++;
//         }

//         chars[k++] = c;
//         if(count > 1 && count <= 9){
//             chars[k++] = (char)(count+'0');
//         }else if(count > 9){
//            k = build(chars, count, k);
//         }

//         return k;
//     }

//     private int build(char[] chars, int value, int k){

//         if(value <= 0) return k;

//         k = build(chars, value/10, k);
//         chars[k++] = (char)((value % 10) +'0');
//         return k;
//     }
// }

// class Solution {
//     public int compress(char[] chars) {

//         int cnt = 0;
//         int cntIdx = 0;
//         char curChar = chars[0];

//         for(int i = 0; i < chars.length; i++) {
//             if(chars[i] == curChar) {
//                 cnt++;
//             }
//             else {
//                 chars[cntIdx++] = curChar;
//                 if(cnt > 1) {
//                     char[] numbers = ("" + cnt).toCharArray();
//                     for(int j = 0; j < numbers.length; j++)
//                         chars[cntIdx++] = numbers[j];
//                 }

//                 cnt = 1;
//                 curChar = chars[i];
//             }

//             if(i == chars.length-1) {
//                 chars[cntIdx++] = curChar;
//                 if(cnt > 1) {
//                     char[] numbers = ("" + cnt).toCharArray();
//                     for(int j = 0; j < numbers.length; j++)
//                         chars[cntIdx++] = numbers[j];
//                 }
//             }
//         }

//         return cntIdx;
//     }
// }
