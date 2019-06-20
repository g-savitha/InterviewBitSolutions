public class Solution {
    public int isPalindrome(int A) {
        if(A<0)
            return 0;
        if(A==reverse(A))
            return 1;
        else return 0;
    }
    public int reverse(int A) {
        int rem = 0;
        int rev = 0;
        while(A > 0){
            rem = A % 10;
            rev = rev * 10 + rem;
            A = A/10;
        }
        return rev;
    }
}
