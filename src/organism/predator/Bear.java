package organism.predator;

import Settings.Settings;

public class Bear extends Predator{
    public static volatile int numBear = 0;
    public Bear() {
        super(Settings.BEAR_WEIGHT, Settings.BEAR_SPEED, Settings.BEAR_MAX_SATIETY, Settings.BEAR_MAX_NUM);
        super.setCanEat(Settings.BEAR_CAN_EAT);
        numBear++;
    }

    @Override
    public void die() {
        numBear--;
    }
}
