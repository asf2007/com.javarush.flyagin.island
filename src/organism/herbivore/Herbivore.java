package organism.herbivore;

import field.Cell;
import organism.Animal;

public class Herbivore extends Animal {

    public Herbivore(double weight, int speed, double maxSatiety, int maxNum) {
        super(weight, speed, maxSatiety, maxNum);
    }

    @Override
    public void die() {

    }


}
