class Solution {
    public String simplifyPath(String path) {
        Stack<String>stack=new Stack<>();
        for(String s:path.split("/")){
            if(s.equals("")||s.equals(".")) continue;
            else if(!stack.isEmpty()&&s.equals("..")){
                stack.pop();
            }
            else if(!s.equals(".."))
                stack.push(s);
            
        }

        StringBuilder sb=new StringBuilder();

        for(String s:stack){
            sb.append('/').append(s);
        }

        return sb.length()==0?"/":sb.toString();

    }
}

