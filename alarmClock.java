public String alarmClock(int day, boolean vacation) {
    String alarm="";
    if (vacation){
        if (day == 0 || day == 6){
            alarm = "off";
        }else{
            alarm = "10:00";
        }
    }if (!vacation){
        if (day==0 || day == 6){
            alarm = "10:00";
        }else{
            alarm = "7:00";
        }
    }return alarm;
}
