double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int n =nums1Size+nums2Size;
    int arr[n];
    int i=0;
     for(int j=0;j<nums1Size;j++){
        arr[i]=nums1[j];
        i++;
    }

    for(int j=0;j<nums2Size;j++){
        arr[i]=nums2[j];
        i++;
    }

    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    double ans=0;
    if(n%2==1){
        ans=(double)arr[n/2];
    }
    else
       ans=((double)arr[n/2]+(double)arr[n/2-1])/2;
    return ans;

}