public class Solution {
    public int[] allFactors(int A) {
        List<Integer> factors = new ArrayList<Integer>();
        List<Integer> small = new ArrayList<Integer>();
        List<Integer> large = new ArrayList<Integer>();
        
        for(int i = 1; i <= Math.sqrt(A); i++){
            if(A % i == 0){
                int x = i;
                int y = A/i;
                if(x != y){
                    small.add(x);
                    large.add(y);
                }
                else{
                    small.add(x);
                }
            }
        }
        for(int num: small)
            factors.add(num);
        for(int i = large.size() -1; i >=0; i--)
            factors.add(large.get(i));
        int[] arr = new int[factors.size()];
        for(int i = 0; i < factors.size(); i++)
        {
            if(factors.get(i) != 0)
                arr[i] = factors.get(i);
        }
        return arr;
    }
}
