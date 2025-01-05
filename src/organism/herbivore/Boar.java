package organism.herbivore;

import Settings.Settings;

public class Boar extends Herbivore{
    public static volatile int numBoar = 0;
    public Boar() {
        super(Settings.BOAR_WEIGHT, Settings.BOAR_SPEED, Settings.BOAR_MAX_SATIETY, Settings.BOAR_MAX_NUM);
        super.setCanEat(Settings.BOAR_CAN_EAT);
        numBoar++;
    }

    @Override
    public void die() {
        numBoar--;
    }
}
