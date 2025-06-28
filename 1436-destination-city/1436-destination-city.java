class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> city =new HashMap<>();
        List<String> tem=new ArrayList<>();
        for(List<String> path:paths){
            city.put(path.get(0),path.get(1));

        }
        tem.add(city.get(paths.get(0).get(0)));
        for(List<String> path:paths){
            if(city.containsKey(tem.get(tem.size()-1))){
                tem.add(city.get(tem.get(tem.size()-1)));
            }
        }
        return tem.get(tem.size()-1);
    }
}