package organism.herbivore;

import Settings.Settings;

public class Caterpillar extends Herbivore {
    public static volatile int numCaterpillar = 0;
    public Caterpillar() {
        super(Settings.CATERPILLAR_WEIGHT, Settings.CATERPILLAR_SPEED, Settings.CATERPILLAR_MAX_SATIETY, Settings.CATERPILLAR_MAX_NUM);
        super.setCanEat(Settings.CATERPILLAR_CAN_EAT);
        numCaterpillar++;
    }

    @Override
    public void die() {
        numCaterpillar--;
    }

}
