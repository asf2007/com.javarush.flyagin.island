package organism;

import field.Cell;
import field.Field;
import organism.herbivore.Herbivore;
import organism.predator.Predator;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal implements Movable, Eatable, Reproduseble, Cloneable {

    private double weight;
    private int speed;
    private double maxSatiety;
    private int maxNum;
    private Map<String, Integer> canEat = new HashMap<>();
    private double actualSatiety = maxSatiety;

    public int getSpeed() {
        return speed;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public void setActualSatiety(double actualSatiety) {
        this.actualSatiety = actualSatiety;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaxSatiety(double maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public double getActualSatiety() {
        return actualSatiety;
    }

    public void setCanEat(Map<String, Integer> canEat) {
        this.canEat = canEat;
    }

    public Animal() {

    }

    public Animal(double weight, int speed, double maxSatiety, int maxNum) {
        this.weight = weight;
        this.speed = speed;
        this.maxSatiety = maxSatiety;
        this.maxNum = maxNum;
    }


    public double getWeight() {
        return weight;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public Map<String, Integer> getCanEat() {
        return canEat;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public boolean eat(Cell cell) {
        if(this.maxSatiety>0) {

            if (this instanceof Herbivore) {
                double canEatNow = this.maxSatiety - this.actualSatiety;
                if (cell.getPlant() > 0) {
                    if ((canEatNow > cell.getPlant())) {
                        this.actualSatiety += cell.getPlant();
                        cell.setPlant(0);
                    } else {
                        cell.setPlant(cell.getPlant() - canEatNow);
                        this.actualSatiety = this.maxSatiety;
                        return true;
                    }

                }
            }
            if (cell.getAnimalList().stream().anyMatch(x -> !x.getClass().equals(this.getClass()))) {
                Animal food = cell.getAnimalList().stream()
                        .filter(x -> !(x.getClass().getSimpleName().equals(this.getClass().getSimpleName())))
                        .findFirst().get();

                if (ThreadLocalRandom.current().nextInt(100) < this.getCanEat().get(food.getClass().getSimpleName())) {
                    double weightAfterEat = this.getActualSatiety() + food.getWeight();
                    if (weightAfterEat > this.getMaxSatiety()) {
                        this.setActualSatiety(this.getMaxSatiety());
                    } else {
                        this.setActualSatiety(weightAfterEat);
                    }
                    // System.out.println(cell.getAnimalList().remove(food));
                    food.die();
                    food = null;


                    return true;
                }
            }
        }

        return false;
    }


    @Override
    public boolean reproduce(Cell cell) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Animal> animals = cell.getAnimalList().stream().filter(x ->x.getClass().equals(this.getClass())).toList();
        int actualNum = animals.size();
        if(this.getMaxNum()>actualNum&&actualNum>1){
            Animal child = this.getClass().getDeclaredConstructor().newInstance();
            child.setActualSatiety(child.getMaxSatiety());
            cell.getChildes().add(child);
            return true;
        } else return false;

    }

    @Override
    public void move(Cell cell, Field field) {
        if(this.getSpeed()>0) {
            int moveX = ThreadLocalRandom.current().nextInt(-1 * this.getSpeed(), this.getSpeed());
            int moveY = ThreadLocalRandom.current().nextInt(-1 * (this.getSpeed() - Math.abs(moveX)), this.getSpeed() - moveX);
            int actualX = cell.getCoordinateX();
            int actualY = cell.getCoordinateY();
            int movedX = actualX + moveX;
            if (movedX < 0) movedX = 0;
            else if (movedX > field.getxSize() - 1) movedX = field.getxSize() - 1;
            int movedY = actualY + moveY;
            if (movedY < 0) movedY = 0;
            else if (movedY > field.getySize() - 1) movedY = field.getySize() - 1;
            cell.getAnimalList().remove(this);
            field.getField()[movedX][movedY].getChildes().add(this);
            // System.out.println("moved");
        }

    }

    public abstract void die();




}
