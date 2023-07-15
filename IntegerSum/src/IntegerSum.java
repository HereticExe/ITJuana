import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSum {
//Unit Test are provid
    public static void main(String[] args) {
        //Unit Test no.1
        int[] numberTestOne = {4,3,2,7,8,2,3,1};
        List<Integer> resultTestOne = numberList(numberTestOne);
        System.out.println("Numbers missing: " + resultTestOne);

        //Unit Test no.2
        int[] numberTestTwo ={1,1};
        List<Integer> resultTestTwo = numberList(numberTestTwo);
        System.out.println("Numbers missing: " + resultTestTwo);
    }


    //The function in charge of returning the list of numbers we need
    /*The key for this logic is as follows: the array is 0 based, so if we negate the value that holds
    the actual number, when we find the contained numbers, we iterate the array one more time to find the
    positive value numbers, after finding the missing numbers, we turn back the positive values with i+1
    Time complexity is O(n) n is the length of the nums array, which we iterated twice
    Space complexity isO(1), because we are using only the data we received, not a growing input*/
    public static List<Integer> numberList(int[]nums){
        List<Integer> numbers = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int actualNumber = Math.abs(nums[i])-1;
            if(nums[actualNumber]>0){
                nums[actualNumber] = -nums[actualNumber];
            }
        }
        for(int i = 0;i<nums.length; i++){
            if(nums[i]>0){
                numbers.add(i+1);
            }
        }
        return numbers;
    }

    }
