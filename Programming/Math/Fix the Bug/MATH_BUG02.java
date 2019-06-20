public class Solution {
    public ArrayList<ArrayList<Integer>> squareSum(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int a, b = 0;
        ArrayList<Integer> newEntry = new ArrayList<Integer>();
        for (a = 0; a * a < A; a++) {
            for (b = 0; b * b < A; b++) {
                if(a<=b){
                    if (a * a + b * b == A) {
                    newEntry.add(a);
                    newEntry.add(b);
                    ans.add(newEntry);
                    }
                }
            }
        }
         return ans;
        }
       
    }

