package organism.herbivore;

import Settings.Settings;

public class Deer extends Herbivore{
    public static volatile int numDeer = 0;
    public Deer() {
        super(Settings.DEER_WEIGHT, Settings.DEER_SPEED, Settings.DEER_MAX_SATIETY, Settings.DEER_MAX_NUM);
        super.setCanEat(Settings.DEER_CAN_EAT);
        numDeer++;
    }

    @Override
    public void die() {
        numDeer--;
    }
}
