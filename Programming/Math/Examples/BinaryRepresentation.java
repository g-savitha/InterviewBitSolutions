public class Solution {
    public String findDigitsInBinary(int A) {
        StringBuilder result = "";
        int rem = 0; 
        if(A==0) result = 0 +"";
        while(A>0){
            rem = A%2;
            result = result + rem;
            A = A/2;
        }
        char[] rs = new char[result.length()];
        for(int i = result.length()-1; i >= 0; i--){
            rs[i]
        }
        return result = result.reverse();
    }
}
