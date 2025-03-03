int arrayPairSum(int* nums, int numsSize) {
  void Sort() {
    for (int i = 1; i < numsSize; i++) {
        int key = nums[i];
        int j = i - 1;

        while (j >= 0 && nums[j] > key) {
            nums[j + 1] = nums[j];
            j--;
        }

        nums[j + 1] = key;
    }
}

    Sort(nums);

    int sum=0;

    for(int i=0;i<numsSize;i+=2){
        sum+=nums[i]<nums[i+1]?nums[i]:nums[i+1];
    }

    return sum;


}