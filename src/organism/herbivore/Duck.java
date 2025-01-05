package organism.herbivore;

import Settings.Settings;

public class Duck extends Herbivore {
    public static volatile int numDuck = 0;
    public Duck() {
        super(Settings.DUCK_WEIGHT, Settings.DUCK_SPEED, Settings.DUCK_MAX_SATIETY, Settings.DUCK_MAX_NUM);
        super.setCanEat(Settings.DUCK_CAN_EAT);
        numDuck++;
    }

    @Override
    public void die() {
        numDuck--;
    }

}
