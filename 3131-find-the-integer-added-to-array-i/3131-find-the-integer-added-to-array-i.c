int addedInteger(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int sum1=0,sum2=0;
    for(int i=0;i<nums1Size;i++){
        sum1+=nums1[i];
        sum2+=nums2[i];
    }
    int dif=sum2-sum1;
    dif/=nums1Size;
    return dif;
}