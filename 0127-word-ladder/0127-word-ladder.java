class Solution {

    class Pair{
        char[] word;
        int distance;

        Pair(String word,int distance){
            this.word=word.toCharArray();
            this.distance=distance;
        }
    } 


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))return 0;

        Queue<Pair> queue=new LinkedList<>();

        queue.offer(new Pair(beginWord,1));
        
        List<String> visited=new ArrayList<>();

        while(!queue.isEmpty()){
            Pair p=queue.poll();
            if(new String(p.word).equals(endWord)){
                return p.distance;
            }

            for(String word:wordList){
                if(!visited.contains(word) && check_diff(p.word,word.toCharArray())==1){
                    queue.offer(new Pair(word,p.distance+1));
                    visited.add(word);
                }
            }


        }
        return 0;
    }

    public int check_diff(char[] arr1,char[] arr2){
        int diff=0;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])diff++;

            if(diff>1)return diff;
        }

        return diff;
    }

    
}