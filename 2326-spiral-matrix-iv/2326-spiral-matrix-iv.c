/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** spiralMatrix(int m, int n, struct ListNode* head, int* returnSize, int** returnColumnSizes) {
    int** result = (int**)malloc(m * sizeof(int*));
    for (int i = 0; i < m; i++) {
        result[i] = (int*)malloc(n * sizeof(int));
        memset(result[i], -1, n * sizeof(int));
    }

    int directions[4][2] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int currentDirection = 0;
    int row = 0, col = 0;

    *returnSize = m;
    *returnColumnSizes = (int*)malloc(m * sizeof(int));
    for (int i = 0; i < m; i++) {
        (*returnColumnSizes)[i] = n;
    }

    while (head != NULL) {
        result[row][col] = head->val;
        head = head->next;

        int nextRow = row + directions[currentDirection][0];
        int nextCol = col + directions[currentDirection][1];

        if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || result[nextRow][nextCol] != -1) {
            currentDirection = (currentDirection + 1) % 4;
            nextRow = row + directions[currentDirection][0];
            nextCol = col + directions[currentDirection][1];
        }

        row = nextRow;
        col = nextCol;
    }

    return result;
}