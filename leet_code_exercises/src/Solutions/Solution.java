package solutions;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
    412. Fizz Buzz

    Given an integer n, return a string array answer (1-indexed) where:
    
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
    */
    public List<String> fizzBuzz(int n) {
        //Create
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if((i%3==0) && (i%5==0)){
                result.add("Fizz");
            }else if(i%3==0){
                result.add("Buzz");
            }else if(i%5==0){
                result.add("FizzBuzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
    /*
     * 1342. Number of steps to reduce a number to zero
     * 
     * Given an integer num, return the number of steps to reduce it to zero.
     *
     *In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    */
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num>0){
            if(num%2==0){
                num = num/2;
            }else{
                num= num-1;
            }
            steps =+1;
        }
        return steps;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> constructor = new HashMap<>();
        //put the magazine string on hashmap, each position
        for(char c : magazine.toCharArray()){
            if(constructor.containsKey(c)){
                constructor.put(c, constructor.get(c) + 1);
            }else{
                constructor.put(c, 1);
            }
        }
        
        //check if we can form the ransomNote with magazine letters
        for (char c : ransomNote.toCharArray()){
            if(constructor.containsKey(c)){
                constructor.put(c, constructor.get(c) - 1);
                if(constructor.get(c) == 0) constructor.remove(c);
            }else{
                return false;
            }
        }
        return true;
    }

    public int findNumbers(int[] nums) {
        //place to store how many numbers have even digits
        int result = 0;
        //iterate over the items
        for(int q : nums){
            if(HasEvenDigits(q))result++;
        }
        return result;
    }
    
    public boolean HasEvenDigits(int num){
        boolean isEven = false;
        while((num/10)!= 0){
            num = num/10;
            isEven = !isEven;
        }
        return isEven;
    }
}