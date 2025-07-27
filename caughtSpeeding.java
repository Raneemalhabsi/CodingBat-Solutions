public int caughtSpeeding(int speed, boolean isBirthday) {
    int result=0;
    if (isBirthday){
        if (speed <=65){
            result = 0;
        }else if (speed >=61 && speed <=85){
            result = 1;
        }else if (speed >=85 ){
            result = 2;
        }
    }
    if (!isBirthday){
        if (speed <=60){
            result = 0;
        }else if (speed >=61 && speed <=80){
            result = 1;
        }else if (speed >=81 ){
            result = 2;}
    }return result;
}


