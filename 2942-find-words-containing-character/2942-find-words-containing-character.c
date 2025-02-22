/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
  int* ans = (int*)malloc( sizeof(int) * wordsSize);
    if (ans == NULL) {
        *returnSize = 0;
        return NULL;
    }
    int index = 0;
    for (int i = 0; i < wordsSize; i++) {
        char* found = strchr(words[i], x);
        if (found != NULL) {
            ans[index++] = i;
        }
    }
    *returnSize = index;
    return ans;
}