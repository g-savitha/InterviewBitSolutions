public class Solution {
    public String findDigitsInBinary(int A) {
        String result = "";
        int rem = 0; 
        if(A==0) result = 0 +"";
        while(A>0){
            rem = A%2;
            result = result + rem;
            A = A/2;
        }
        
        String reverse = "";
        for(int i = result.length()-1; i >= 0; i-- )
            reverse = reverse + result.charAt(i);
        return reverse;
    }
}
