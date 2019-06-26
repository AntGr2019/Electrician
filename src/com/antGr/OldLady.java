package com.antGr;

class OldLady {
    int seeCount = 0;
    void seeIsLightly(Flat x){
        x.switchOnLamp(x.ladiesLamp);
        System.out.println("OldLady observed: The lighting in the flat is " + x.isLightly() + "\n");
        if (x.isLightly()==false){
            callElectrician(x);
        }

    }
    void callElectrician(Flat x){
        System.out.println("OldLady has called an electrician \n");
        Electrician master = new Electrician();
        master.repair(x.ladiesLamp);
    }

}
