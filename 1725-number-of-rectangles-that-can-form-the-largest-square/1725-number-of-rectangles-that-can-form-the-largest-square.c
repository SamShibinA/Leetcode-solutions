

int countGoodRectangles(int** rectangles, int rectanglesSize, int* rectanglesColSize){
  
    int maxLen = 0;
    int count = 0;

    for (int i = 0; i < rectanglesSize; i++) {
        int minSide = fmin(rectangles[i][0], rectangles[i][1]);
        if (minSide > maxLen) {
            maxLen = minSide;
            count = 1;
        } else if (minSide == maxLen) {
            count++;
        }
    }

    return count;
}