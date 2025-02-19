int positive(int a){
    return a>0?a:-1*a;
}
int countGoodTriplets(int* arr, int arrSize, int a, int b, int c){
    int ans=0;
    for(int i=0;i<arrSize;i++)for(int j=i+1;j<arrSize;j++)for(int k=j+1;k<arrSize;k++){
        if(positive(arr[i]-arr[j])<=a && positive(arr[j]-arr[k])<=b && positive(arr[i]-arr[k])<=c ){
            ans+=1;
        }
    }
    return ans;
}