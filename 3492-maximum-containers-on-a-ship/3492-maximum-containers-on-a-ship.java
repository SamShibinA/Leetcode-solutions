class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalSlots = n * n;
        int maxContainersByWeight = maxWeight / w;
        return Math.min(totalSlots, maxContainersByWeight);
    }
}
