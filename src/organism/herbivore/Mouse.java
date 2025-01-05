package organism.herbivore;

import Settings.Settings;

public class Mouse extends Herbivore{
    public static volatile int numMouse = 0;
    public Mouse() {
        super(Settings.MOUSE_WEIGHT, Settings.MOUSE_SPEED, Settings.MOUSE_MAX_SATIETY, Settings.MOUSE_MAX_NUM);
        super.setCanEat(Settings.MOUSE_CAN_EAT);
        numMouse++;
    }

    @Override
    public void die() {
        numMouse--;
    }
}
