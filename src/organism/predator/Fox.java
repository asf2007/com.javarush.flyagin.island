package organism.predator;

import Settings.Settings;
import organism.Animal;

public class Fox extends Predator {
    public static volatile int numFox = 0;




    public Fox() {
        super(Settings.FOX_WEIGHT, Settings.FOX_SPEED, Settings.FOX_MAX_SATIETY, Settings.FOX_MAX_NUM);
        super.setCanEat(Settings.FOX_CAN_EAT);
        numFox++;
    }

    @Override
    public void die() {
        numFox--;
    }
}
