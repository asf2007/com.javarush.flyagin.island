package organism.herbivore;

import Settings.Settings;

public class Buffalo extends Herbivore{
    public static volatile int numBuffalo = 0;
    public Buffalo() {
        super(Settings.BUFFALO_WEIGHT, Settings.BUFFALO_SPEED, Settings.BUFFALO_MAX_SATIETY, Settings.BUFFALO_MAX_NUM);
        super.setCanEat(Settings.BUFFALO_CAN_EAT);
        numBuffalo++;
    }

    @Override
    public void die() {
        numBuffalo -- ;
        //System.out.println("Buffalo die...................................................................");
    }
}
