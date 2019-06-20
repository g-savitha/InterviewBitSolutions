public class Solution {
    public String[] fizzBuzz(int A) {
        String[] fb = new String[A+1];
        String[] modifiedFb = new String[fb.length];
        fb[0] = "";
        if(A!= 0){
        for(int i = 1; i <= A; i++){
            if(i == 0) continue;
            if(i % 15 == 0){
                fb[i] = "FizzBuzz";
            }
            else if (i % 5 == 0){
                fb[i] = "Buzz";
            }
            else if(i % 3 == 0){
                fb[i] = "Fizz";
            }
            else{
                fb[i] = i + "";
            }
        }
        modifiedFb = Arrays.copyOfRange(fb,1,fb.length);
       
    }
     return modifiedFb;
    }
    
}

