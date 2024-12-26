    /*
    * Brute force:
    * Using same principle as finding all subsets of a array.
    * 
    * We will include the element as positive number and we will include the element as negative number.
    * At the end of traverse, we will check if sum is equal to target or not.
    * And return value based on that.
    */

    /*
    * find all expressions which match the target value:
    * @Param: nums (Original Array), target (target value to achieve)
    * @Return: int (number of expressions)
    */
    class BruteForce {
        public int findTargetSumWaysHelper(int[] nums, int index, int target, int sum){
            if(index == nums.length){
                return (sum == target) ? 1 : 0;
            }

            int temp1 = sum - nums[index];
            int temp2 = sum + nums[index];

            // Same principle of finding all subsets of a array. using include and exclude an element to find answer.
            /*
            * NOTE: Do not do index++ as we want to use same index value on both function calls. Or you can increment index first then call both functions.
            * index++;
            * return findTargetSumWaysHelper(nums, index, target, temp1) + findTargetSumWaysHelper(nums, index, target, temp2);
            */
            return findTargetSumWaysHelper(nums, index + 1, target, temp1) + findTargetSumWaysHelper(nums, index + 1, target, temp2);
        }

        public int findTargetSumWays(int[] nums, int target) {
            return findTargetSumWaysHelper(nums, 0, target, 0);
        }
    }