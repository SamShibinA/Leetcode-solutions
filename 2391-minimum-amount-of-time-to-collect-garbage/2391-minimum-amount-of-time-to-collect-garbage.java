class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int glass=0,paper=0,metal=0;
        int glasstime=0,papertime=0,metaltime=0;
        int answer=0;

        for(int i=0;i<garbage.length;i++){

            for(int j=0;j<garbage[i].length();j++){
                if(garbage[i].charAt(j)=='P'){
                    paper++;
                }
                else if(garbage[i].charAt(j)=='M'){
                    metal++;
                }
                else{
                    glass++;
                }
            }

            if(glass>0){
                answer+=glass;
                answer+=glasstime;
                glasstime=0;
            }

            if(paper>0){
                answer+=paper;
                answer+=papertime;
                papertime=0;
            }

            if(metal>0){
                answer+=metal;
                answer+=metaltime;
                metaltime=0;
            }


            if(i<garbage.length-1){
                glass=0;
                metal=0;
                paper=0;
                glasstime+=travel[i];
                metaltime+=travel[i];
                papertime+=travel[i];
            }

        }
        return answer;
    }
}