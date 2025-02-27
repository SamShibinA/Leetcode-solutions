/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* finalPrices(int* prices, int pricesSize, int* returnSize) {
    int* ans=(int*)malloc(sizeof(int)*pricesSize);
    *returnSize=pricesSize;
    int id=0;
    for(int i=0;i<pricesSize-1;i++){
        for(int j=i+1;j<pricesSize;j++){
            ans[id]=prices[i];
            if(prices[i]>=prices[j]){
                ans[id]=prices[i]-prices[j];
                break;
            }
        }
            id++;
    }
    ans[id]=prices[pricesSize-1];
    return ans;
}