package organism.predator;

import Settings.Settings;
import organism.Animal;

import java.util.Map;

public class Wolf extends Predator {
   public static volatile int numWolfs = 0;




    public Wolf() {
        super(Settings.WOLF_WEIGHT, Settings.WOLF_SPEED, Settings.WOLF_MAX_SATIETY, Settings.WOLF_MAX_NUM);
        super.setCanEat(Settings.WOLF_CAN_EAT);
        numWolfs++;
    }

    @Override
    public void die() {
        numWolfs--;
    }
}
