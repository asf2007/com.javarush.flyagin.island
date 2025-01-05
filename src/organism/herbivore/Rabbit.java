package organism.herbivore;

import Settings.Settings;

public class Rabbit extends Herbivore{
    public static volatile int numRabbit = 0;
    public Rabbit() {
        super(Settings.RABBIT_WEIGHT, Settings.RABBIT_SPEED, Settings.RABBIT_MAX_SATIETY, Settings.RABBIT_MAX_NUM);
        super.setCanEat(Settings.RABBIT_CAN_EAT);
        numRabbit++;
    }



    @Override
    public void die() {
        numRabbit--;
    }
}
