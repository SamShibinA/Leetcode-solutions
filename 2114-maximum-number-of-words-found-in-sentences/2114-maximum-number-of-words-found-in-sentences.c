int mostWordsFound(char** sentences, int sentencesSize) {
    int maxWords = 0;
    int currentWords = 0;
    for (int i = 0; i < sentencesSize; i++) {
        currentWords = 1; 
        for (int j = 0; sentences[i][j] != '\0'; j++) {
            if (sentences[i][j] == ' ') {
                currentWords++; 
            }
        }
        maxWords = fmax(maxWords, currentWords);
    }
    return maxWords;
}