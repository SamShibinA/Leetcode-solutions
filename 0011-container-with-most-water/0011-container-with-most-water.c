int maxArea(int* height, int heightSize) {
    int max_area = 0;
    int left = 0, right = heightSize - 1;
    while (left < right) {
        int current_area = fmin(height[left], height[right]) * (right - left);
        max_area = fmax(max_area, current_area);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max_area;
}

