import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[]= new int[2];
        int size= nums.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i]+nums[j]==target){
                    sum[0]= i;
                    sum[1]= j;
                }
                else{
                    continue;
                }
            }
        }
        return sum;
    }
}
