public class Solution {
    public int reverse(int A) {
        int rem = 0;
        long rev = 0;
        while(A != 0){
            rem = A % 10;
            rev = rev * 10 + rem;
            A = A/ 10;
        }
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) return 0;
        return (int)rev;
    }
}
