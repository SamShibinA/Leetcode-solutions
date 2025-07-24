class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> answer=new ArrayList<>();

        for(int hour=0;hour<12;hour++){
            for(int minute=0;minute<60;minute++){
                if(Integer.bitCount(hour)+Integer.bitCount(minute)==turnedOn){
                    answer.add(hour+":"+String.format("%02d",minute));
                }
            }
        }

        return answer;
    }
}