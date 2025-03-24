class Solution {
public:
    int countKConstraintSubstrings(string s, int k) {
        int z=0,o=0,c=0,l=0;
        for(int r=0;r<s.length();++r){
            if(s[r]=='0'){
                z++;
            }
            else{
                o++;
            }
            
            while(z>k && o>k){
                if(s[l]=='0'){
                    z--;
                }
                else{
                    o--;
                }
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
};