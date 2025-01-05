package organism.herbivore;

import Settings.Settings;

public class Goat extends Herbivore {
    public static volatile int numGoat = 0;
    public Goat() {
        super(Settings.GOAT_WEIGHT, Settings.GOAT_SPEED, Settings.GOAT_MAX_SATIETY, Settings.GOAT_MAX_NUM);
        super.setCanEat(Settings.GOAT_CAN_EAT);
        numGoat++;
    }

    @Override
    public void die() {
        numGoat--;
    }

}
