public class Solution {
    public int isPrime(int A) {
        if (A==1) return 1;
        for(int i = 2; i <= Math.sqrt(A); i++){
            if(A%i == 0)
              {
                  if((i < Math.sqrt(A) && (A/i) > Math.sqrt(A)) || i == (A/i))
                    return 0;
              }
         
        }
        return 1;
    }
}
