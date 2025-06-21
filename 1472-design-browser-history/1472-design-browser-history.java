class BrowserHistory {
     
     private String[] map;
     private int current;
     private int last;

     
    public BrowserHistory(String homepage) {
        map=new String[5001];
        current=0;
        map[current]=homepage;
        last=0;
    }
    
    public void visit(String url) {
        current++;
        map[current]=url;
        last=current;
    }
    
    public String back(int steps) {
        current=Math.max(0,current-steps);
        return map[current];
    }
    
    public String forward(int steps) {
        current=Math.min(last,current+steps);
        return map[current];
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
