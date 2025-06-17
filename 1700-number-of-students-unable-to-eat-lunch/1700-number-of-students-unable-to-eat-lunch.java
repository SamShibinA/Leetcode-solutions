class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int eat=0;
        ArrayList<Integer> stud=new ArrayList<>();
        ArrayList<Integer> sand=new ArrayList<>();
        for(int n:students)stud.add(n);
        for(int n:sandwiches)sand.add(n);

        while(!(stud.isEmpty())){
            if(sand.get(0)==stud.get(0)){
                sand.remove(0);
                stud.remove(0);
                eat=0;
            }
            else{
                stud.add(stud.remove(0));
                eat++;

            }
            if(eat==stud.size()) break;
        }
    return stud.size();
    }
}