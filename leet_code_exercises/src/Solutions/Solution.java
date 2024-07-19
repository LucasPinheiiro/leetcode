package solutions;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
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
//////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * function to calculate how many numbers with even digits are in the given array
 */
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
//////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * funtion that sqaures the numbers that are given in a crescent order. Must return
 * an array with the numbers squared in the crescent order too
 */
    public int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];
        //iterate over the whole array of integers
        for(int i=0; i<nums.length; i++){
            squared[i] = nums[i]*nums[i];
        }
        //return the numbers squared and ordered in crescent order
        Arrays.sort(squared);
        return squared;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Given a fixed-length integer array arr, 
 * duplicate each occurrence of zero, shifting the remaining elements to the right.
 */
    public void duplicateZeros(int[] arr) {
        //start searching the array from beggining
        //whe finds a zero, go to the end and start copying the [n-1] into [n] position
        //stops when the indexes i == j
        //jumps the recently added zero and iterate over the entire array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length -1; j > i; j--){
                    arr[j] = arr[j-1];
                }
                //skip the zero just added in front o the '0' occurrence
                i++;
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
*
* Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            m=n;
            return;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if((nums2[i] <= nums1[j])){ //criteria to insert the number in the position : must be greater/equal to idx and lower than the next
                    //shifts the ending of the array one position left till the poin of insertion
                    for(int k = m; k > j; k--){ 
                        nums1[k] = nums1[k-1];
                    }
                    //insert the number from nums2 into nums1, in front of the actual index
                    nums1[j] = nums2[i];
                    // increment the populated size of nums1
                    m++; 
                    //get out of actual insertion and seeks another number to insert in nums1 from nums2
                    break;
                }
                if(j == m-1){
                    //if passed trough all nums1 and couldn't insert, so put the remaining numbers at the tail
                    nums1[m] = nums2[i];
                    m++;
                    break;
                }
            }
        }
        ;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 */
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for(int i = 0; i < size;){
            if(nums[i] == val){
                //shifts the remaining array to the left erasing the number in the current position
                for(int j = i; j<(size-1); j++){
                    nums[j] = nums[j + 1];
                }
                size--;
            }else{
                i++;
            }
        }
        return size;
    }
}