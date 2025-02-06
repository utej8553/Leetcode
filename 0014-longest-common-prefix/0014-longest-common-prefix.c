char* longestCommonPrefix(char** strs, int strsSize) {
    char* first = strs[0];
    char* ans = (char*)malloc(strlen(first)+1*sizeof(char));
    int z = 0;
    for(int i = 0; i < strlen(first); i++) {
        for(int j = 0; j < strsSize; j++) {
            if(strs[j][i]!=first[i]) {
                ans[z] = '\0';
                return ans;
            }
        }
        ans[z++] = first[i];
    }
    ans[z] = '\0';
    return ans;
}