bool arrayStringsAreEqual(char** word1, int word1Size, char** word2, int word2Size) {
        if (word1Size == 0 || word2Size == 0) {
        return false;
    }
    int totalLen1 = 0, totalLen2 = 0;
    for (int i = 0; i < word1Size; i++) {
        totalLen1 += strlen(word1[i]);
    }
    for (int i = 0; i < word2Size; i++) {
        totalLen2 += strlen(word2[i]);
    }
    if (totalLen1 != totalLen2) {
        return false;
    }

    int word1Index = 0, word2Index = 0;
    int charIndex1 = 0, charIndex2 = 0;
    while (word1Index < word1Size && word2Index < word2Size) {
        char ch1 = word1[word1Index][charIndex1];
        char ch2 = word2[word2Index][charIndex2];

        if (ch1 != ch2) {
            return false;
        }
        charIndex1++;
        if (word1[word1Index][charIndex1] == '\0') {
            charIndex1 = 0;
            word1Index++;
        }
        charIndex2++;
        if (word2[word2Index][charIndex2] == '\0') {
            charIndex2 = 0;
            word2Index++;
        }
    }
    return (word1Index == word1Size && word2Index == word2Size);
}