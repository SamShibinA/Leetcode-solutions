/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* diStringMatch(char* s, int* returnSize) {
    int l = strlen(s), ii = 0, d = l, id = 0;
    int* ans = (int*)malloc(sizeof(int) * (l + 1));
    *returnSize = l + 1;

    for (int i = 0; i < l; i++) {
        if (s[i] == 'I') {
            ans[id] = ii;
            ii++;
            id++;
        } else {
            ans[id] = d;
            d--;
            id++;
        }
    }

    ans[id] = d;

    return ans;

}