class Solution {
    public int[] productExceptSelf(int[] nums) {
        // find the product of all elements in nums store in a int
        int product = 1;
        int result[] = new int[nums.length];
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) zeroCount++;
            product *= num;
        }

        int specialProduct = 1;

        // divide the final product by each element in nums[] and store in result[]
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroCount > 1) {
                    result[i] = 0;
                } else {
                    for (int num : nums) {
                        if (num == 0) continue;
                        specialProduct *= num;
                    }
                    result[i] = specialProduct;
                }
            } else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}  
