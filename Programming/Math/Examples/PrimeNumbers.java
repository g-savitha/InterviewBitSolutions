public class Solution {
    public int[] sieve(int A) {
        int[] primes = new int[A+1];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < primes.length; i++)
            primes[i] = 1;
        primes[0] = 0;
        primes[1]=1;
        for(int i = 2; i<=Math.sqrt(A); i++){
            if(primes[i]==1){
                for(int j = 2; i * j <=A; j++)
                    primes[i*j] = 0;
            }
        }
        for(int i =2; i <= A; i++){
            if(primes[i] == 1)
                 result.add(i);
        }
        return result;
    }
}
