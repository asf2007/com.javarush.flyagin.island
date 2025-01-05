package organism.predator;

import field.Cell;
import organism.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Predator extends Animal {



    public Predator(double weight, int speed, double maxSatiety,  int maxNum) {
        super(weight, speed, maxSatiety, maxNum);
    }



    @Override
    public void die() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}