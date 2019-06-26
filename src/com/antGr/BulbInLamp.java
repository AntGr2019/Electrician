package com.antGr;

class BulbInLamp {
    boolean status;
    BulbInLamp(boolean x){
        status = x;
    }
    void crash(BulbInLamp x){
        x.status = false;
        System.out.println("The lamp is broke");
    }
    void repair(){
        status = true;
    }
}
