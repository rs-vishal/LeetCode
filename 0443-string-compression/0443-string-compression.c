int compress(char* chars, int charsSize) {
    int index = 0;
    for(int i=0;i<charsSize;i++){
        char c = chars[i];
        int count =1;
        while(i+1< charsSize &&  chars[i+1] == c){
            i++;
            count++;
        }

        chars[index++] = c;
        if(count > 1){
            char buffer[20];
            int len = sprintf(buffer, "%d", count);
            for (int j = 0; j < len; j++) {
                chars[index++] = buffer[j];
            }
        }
    }
    return index;
}