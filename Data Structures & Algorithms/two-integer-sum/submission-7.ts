class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */

    // 2, 7, 11, 15 - target = 9

    // comp = target - nums[i] = 9 - 2 = 7

    // map - 2: 0


    twoSum(nums: number[], target: number): number[] {
        const indexByComplement = new Map<number, number>();

        for (let i = 0; i < nums.length; i++) {
            let complement = target - nums[i];

            if (indexByComplement.has(complement)) {
                return [indexByComplement.get(complement), i];
            } 
            
            indexByComplement.set(nums[i], i);
        }

        return [];
    }
}
