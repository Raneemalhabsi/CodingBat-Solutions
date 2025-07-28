public int teaParty(int tea, int candy) {
    int outcome=0;
    if(tea < 5 || candy < 5){
        outcome = 0;
    }else if (tea >= candy + candy || candy >= tea + tea){
        outcome = 2;
    }else if (tea>=5 && candy >=5){
        outcome = 1;
    }return outcome;
}
