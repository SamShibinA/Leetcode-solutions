int numWaterBottles(int numBottles, int numExchange) {
    int ans=numBottles,rem=0;

    while(numBottles!=0){
        rem=numBottles%numExchange;
        ans+=numBottles/numExchange;
        numBottles/=numExchange;
        if(numBottles==0) break;
        numBottles+=rem;
    }
    return ans;
}