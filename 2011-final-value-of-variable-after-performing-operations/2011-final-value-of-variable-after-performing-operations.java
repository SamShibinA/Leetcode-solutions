class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c = 0;
        for (String s : operations) {
            if (s.equals("X++") || s.equals("++X")) {
                c++;
            } else {
                c--;
            }
        }
        return c;
    }
}
