class Solution {
    public int slidingPuzzle(int[][] board) {
        
        int[][] nei={{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};

        int moves=0;

        Queue<String> q=new LinkedList<>();

        String target="123450";

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<2;i++)for(int j=0;j<3;j++) sb.append(board[i][j]);

        String cur=sb.toString();

        Set<String> visited = new HashSet<>();

        q.offer(cur);
        visited.add(cur);

        while(!q.isEmpty()){
            int size=q.size();

            for(int s=0;s<size;s++){
                cur=q.poll();

                if(cur.equals(target))return moves;

                int zidx=cur.indexOf('0');

                for(int idx:nei[zidx]){
                    String next=swap(cur,idx,zidx);
                    if(!visited.contains(next)){
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
            moves++;
        }
        return -1;
    }


    public String swap(String s,int i,int j){
        char[] arr=s.toCharArray();

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return new String(arr);
    }
}