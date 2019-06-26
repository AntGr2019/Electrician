package com.antGr;

class Electrician {
    void repair(BulbInLamp x){
        x.repair();
        System.out.println("Electrician has repaired the lamp. Не says: The lamp is " + x.status + "\n");

    }
}
