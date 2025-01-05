package organism.predator;

import Settings.Settings;

public class Boa extends Predator{
    public static volatile int numBoa = 0;
    public Boa() {
        super(Settings.BOA_WEIGHT, Settings.BOA_SPEED, Settings.BOA_MAX_SATIETY, Settings.BOA_MAX_NUM);
        super.setCanEat(Settings.BOA_CAN_EAT);
        numBoa++;
    }

    @Override
    public void die() {
        numBoa--;
    }
}
