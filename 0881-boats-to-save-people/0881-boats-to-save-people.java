class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int c=0;
       Arrays.sort(people);
       int l=0,r=people.length-1;
       while(l<=r){
        if(people[l]+people[r]>limit){
            c++;
            r--;
        }
        else{
            if(people[l]+people[r]==limit){
                r--;
                l++;
                c++;
            }else{
                c++;
                l++;
                r--;
            }
            
        }

       }
       return c;
    }
}