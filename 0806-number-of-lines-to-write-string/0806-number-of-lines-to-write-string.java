class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;  // Start with one line
        int width = 0;  // Current line width

        for (char c : s.toCharArray()) {
            int w = widths[c - 'a'];  // Get width of the character
            if (width + w > 100) {    // Exceeds max width per line
                lines++;
                width = w;            // Start new line
            } else {
                width += w;
            }
        }

        return new int[]{lines, width};
    }
}
