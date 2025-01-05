package organism.herbivore;

import Settings.Settings;

public class Sheep extends Herbivore{
    public static volatile int numSheep = 0;
    public Sheep() {
        super(Settings.SHEEP_WEIGHT, Settings.SHEEP_SPEED, Settings.SHEEP_MAX_SATIETY, Settings.SHEEP_MAX_NUM);
        super.setCanEat(Settings.SHEEP_CAN_EAT);
        numSheep++;
    }

    @Override
    public void die() {
        numSheep--;
    }
}
