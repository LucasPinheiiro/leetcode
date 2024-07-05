/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        //Create
        List<String> result = new List<String>;
        for (int i = 0; i <= n; i++){
            if((n%3==0) && (n%5==0)){
                result[i] = "FizzBuzz"
            }else if(n%3==0){
                result[i] = "Fizz"
            }else if(n%5==0){
                result[i] = "Buzz"
            }else{
                result[i] = String.valueOf(i);
            }
        }
        return result;
    }
}