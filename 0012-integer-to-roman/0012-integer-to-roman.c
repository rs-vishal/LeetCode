char* intToRoman(int num) {
    char *result = malloc(sizeof(char)*20);
    char * symbol []= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int value []= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    int i=0;
    strcpy(result,"");
    while(num >0){
        while(num >= value[i]){
            strcat(result,symbol[i]);
            num -= value[i];
        }
        i++;
    }
    return result;
}