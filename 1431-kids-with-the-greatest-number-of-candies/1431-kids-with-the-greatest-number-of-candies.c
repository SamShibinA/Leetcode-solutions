/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    bool* ans=(bool*)malloc(sizeof(bool)*candiesSize);
    *returnSize=candiesSize;
    int max=0;
    for(int i=0;i<candiesSize;i++){
        max=fmax(max,candies[i]);
    }
    int check=max/2+extraCandies;
    for(int i=0;i<candiesSize;i++){
       ans[i]=(candies[i]+extraCandies)>=max;
    }

    return ans;
}