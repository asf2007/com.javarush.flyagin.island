package organism.herbivore;

import Settings.Settings;

public class Horse extends Herbivore{
    public static volatile int numHorse = 0;
    public Horse() {
        super(Settings.HORSE_WEIGHT, Settings.HORSE_SPEED, Settings.HORSE_MAX_SATIETY, Settings.HORSE_MAX_NUM);
        super.setCanEat(Settings.HORSE_CAN_EAT);
        numHorse++;
    }

    @Override
    public void die() {
        numHorse--;
    }
}
