class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1=new HashSet<>();
        add(set1,nums1);
        
        Set<Integer> set2=new HashSet<>();
        add(set2,nums2);

        Set<Integer> set3=new HashSet<>();
        add(set3,nums3);

        Set<Integer> copy1=new HashSet<>(set1);
        Set<Integer> copy2=new HashSet<>(set2);
        Set<Integer> copy3=new HashSet<>(set1);

        copy1.retainAll(set2);
        copy2.retainAll(set3);
        copy3.retainAll(set3);

        copy1.addAll(copy2);
        copy1.addAll(copy3);

        return new ArrayList<>(copy1);

         
    }

    public void add(Set<Integer> set,int[] num){
        for(int n:num){
            set.add(n);
        }
    }
}