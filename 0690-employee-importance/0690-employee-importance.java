/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {

        int ans=0;

        Queue<Employee> q=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        Map<Integer,Employee> map=new HashMap<>();


        for(Employee e:employees){
            map.put(e.id,e);
        }

        q.offer(map.get(id));
        set.add(id);

        while(!q.isEmpty()){
            Employee e=q.poll();

            ans+=e.importance;

            for(int nei:e.subordinates){
                if(!set.contains(nei)){
                    q.offer(map.get(nei));
                    set.add(nei);
                }
            }
        }

        return ans;
    }
}