package com.antGr;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        Flat oldLadysFlat = new Flat();
        OldLady lady = new OldLady();
        BulbInLamp lamp = new BulbInLamp(true);
        oldLadysFlat.ladiesLamp = lamp;

        lady.seeIsLightly(oldLadysFlat);

        oldLadysFlat.ladiesLamp.crash(oldLadysFlat.ladiesLamp);
        lady.seeIsLightly(oldLadysFlat);

        lady.seeIsLightly(oldLadysFlat);
        System.out.println("The end.");

    }
}
