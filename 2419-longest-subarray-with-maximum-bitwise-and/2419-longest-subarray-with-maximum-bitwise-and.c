int longestSubarray(int* nums, int numsSize) {
    int findMaxBitwiseAnd(int* nums, int numsSize) {
    int max_and = INT_MIN;
    for (int i = 0; i < numsSize; ++i) {
        if (nums[i] > max_and) {
            max_and = nums[i];
        }
    }
    return max_and;
}

if (numsSize == 0) return 0;

    int max_and = findMaxBitwiseAnd(nums, numsSize);

    int max_length = 0;
    int current_length = 0;


    for (int i = 0; i < numsSize; ++i) {
        if (nums[i] == max_and) {
            current_length++;
        } else {
            if (current_length > max_length) {
                max_length = current_length;
            }
            current_length = 0;
        }
    }


     if (current_length > max_length) {
        max_length = current_length;
    }

    return max_length;
}