package organism.predator;

import Settings.Settings;

public class Eagle extends Predator{
    public static volatile int numEagle = 0;
    public Eagle() {
        super(Settings.EAGLE_WEIGHT, Settings.EAGLE_SPEED, Settings.EAGLE_MAX_SATIETY, Settings.EAGLE_MAX_NUM);
        super.setCanEat(Settings.EAGLE_CAN_EAT);
        numEagle++;
    }

    @Override
    public void die() {
        numEagle--;
    }
}
