import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numsOne = {2,11,7,15};
        int targetOne = 9;
        int[] resultOne = twoSum(numsOne,targetOne);
        System.out.println("Index of two numbers that add up to target in numsOne: " + Arrays.toString(resultOne));

    }
/*Solution: Hashmap to store the element of the array and the index, next step is substract the target with the number in the index
    if the current number is present within the hashmap, we found one of the numbers, so we return the index, if we dont find the pair
    we throw an exception
    Time complexity is O(n) length of the inpiut array is the n, hashmap operation is constant
    Space complexity is O(n) in the worst scenario we will store all the elements in the hashmap */
    public static int[] twoSum(int[]nums,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int auxNumber = target - nums[i];
            if(map.containsKey(auxNumber)){
                return new int[]{map.get(auxNumber),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No elements add in the selected target");
    }

    }

