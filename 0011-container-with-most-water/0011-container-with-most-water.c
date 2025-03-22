int maxArea(int* height, int heightSize) {
        int i = 0;
    int j = heightSize - 1;
    int result = 0;
    int temp = 0;
    while (j > i) {
        int h1 = height[i];
        int h2 = height[j];
        temp = (j - i) * ((h1 < h2) ? h1 : h2);
        if (temp > result) result = temp;
        if (h1 >= h2) {
            j--;
        } else {
            i++;
        }
    }
    return result;

}