package chap07.overloading;

import java.rmi.dgc.DGC;

public class HouseDog extends Dog {
    void sleep(int hour) {
        System.out.println(this.name + " Zzz..." + hour + "hours");
    }

    public static void main(String[] args) {
        HouseDog housedog = new HouseDog();
        housedog.setName("Chris");
        housedog.sleep();
        housedog.sleep(6);

    }
}
