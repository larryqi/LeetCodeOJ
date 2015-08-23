import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by linqi on 15/8/3.
 */
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        // sort array
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] > nums[i-1]) {
                int negate = 0 - nums[i];
                int start = i + 1;
                int end = nums.length - 1;
                while ( start < end) {
                    if (nums[start] + nums[end] == negate) {
                        ArrayList<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[start]);
                        tmp.add(nums[end]);
                        result.add(tmp);
                        start++;
                        end--;
                        while (start < end && nums[end] == nums[end+1]) {
                            end--;
                        }
                        while (start < end && nums[start] == nums[start-1]) {
                            start++;
                        }
                    }
                    else if (nums[start] + nums[end] < negate) {
                        start++;
                    }
                    else {
                        end--;
                    }
                }

                }

            }



        return result;

    }
}
public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        new Solution().threeSum(nums).forEach(System.out::println);

    }
}
