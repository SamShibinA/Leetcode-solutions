class OrderedStream {
    Map<Integer,String> map;
    int n;
    int ptr;
    public OrderedStream(int n) {
        this.n=n;
        map=new HashMap<>();
        ptr=1;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> ans=new ArrayList<>();
        map.put(idKey,value);
        for(int i=1;i<=n;i++){
            if(map.containsKey(ptr)){
                ans.add(map.get(ptr));
                ptr++;
            }
            else{
                break;
            }

        }
        return ans;
    }
}

