int countConsistentStrings(char *allowed, char **words, int wordsSize) {
    int count = 0;
    bool allowedChars[26] = {false};

    for (int i = 0; allowed[i] != '\0'; i++) {
        allowedChars[allowed[i] - 'a'] = true;
    }

    for (int i = 0; i < wordsSize; i++) {
        bool isConsistent = true;
        for (int j = 0; words[i][j] != '\0'; j++) {
            if (!allowedChars[words[i][j] - 'a']) {
                isConsistent = false;
                break;
            }
        }
        if (isConsistent) {
            count++;
        }
    }

    return count;
}