package com.antGr;

class Flat {
    boolean isLight = false;
    BulbInLamp ladiesLamp;
    void switchOnLamp(BulbInLamp x){
        isLight = x.status;
}
    boolean isLightly(){
    return isLight;
    }

}
