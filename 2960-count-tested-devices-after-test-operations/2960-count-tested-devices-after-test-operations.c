int countTestedDevices(int* batteryPercentages, int batteryPercentagesSize) {
    int c=0,n=batteryPercentagesSize;
    
    for(int i=0;i<n;i++){
        if(batteryPercentages[i]>0){
            c++;
            for(int j=i+1;j<n;j++){
                batteryPercentages[j]=fmax(0,batteryPercentages[j]-1);
            }
        }
    }
    return c;
}