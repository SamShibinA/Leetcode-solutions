/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findIntersectionValues(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int* ans=(int*)malloc(sizeof(int)*2);
    int o=0,s=0;

    for(int i=0;i<nums1Size;i++){
        for(int j=0;j<nums2Size;j++){
            if(nums1[i]==nums2[j]){
                o++;
                break;
            }
        }
    }

    for(int i=0;i<nums2Size;i++){
        for(int j=0;j<nums1Size;j++){
            if(nums2[i]==nums1[j]){
                s++;
                break;
            }
        }
    }

    ans[0]=o;
    ans[1]=s;

    *returnSize=2;

    return ans;


}