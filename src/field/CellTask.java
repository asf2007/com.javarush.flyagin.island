package field;

import organism.Animal;
import organism.Plant;
import organism.herbivore.*;
import organism.predator.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CellTask implements Runnable{
    public CellTask(Cell cell) {
        this.cell = cell;
    }

    private Cell cell;
    private CountDownLatch countDownLatch;

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void run() {
//        for (int j = 0; j < 8; j++) {
//            System.out.println("day = " + j);
        //System.out.println("go");


//        List<Animal> childes = cell.getChildes();
//        for (Animal child : childes) {
//            cell.getAnimalList().add(child);
//        }
//        childes.clear();
            for (int i = 0; i < cell.getAnimalList().size(); i++) {
                Animal animal = cell.getAnimalList().get(i);
                if (animal.eat(cell)) {


                    try {
                        if(animal.reproduce(cell)) {
                            animal.move(cell, cell.getField());

                        }
                    } catch (CloneNotSupportedException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    } catch (InstantiationException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }


            }
                animal.setActualSatiety(animal.getActualSatiety() - animal.getMaxSatiety() / 10);
                if(animal.getActualSatiety()<=0){
                    animal.die();
                    cell.getAnimalList().remove(animal);
                    animal = null;
                }
            }


        // System.out.println(cell.getChildes());


       // System.out.println("-----------------------------------------------------------------------" + Thread.currentThread().getName());

            cell.addPlant();
            //Plant.sumPlant = 0;
            Plant.sumPlant += cell.getPlant();
            countDownLatch.countDown();

//            System.out.println("Plant = " + Plant.sumPlant);
//            System.out.println("Wolf = " + Wolf.numWolfs);
//            System.out.println("Fox = " + Fox.numFox);
//            System.out.println("Eagle = " + Eagle.numEagle);
//            System.out.println("Bear = " + Bear.numBear);
//            System.out.println("Boa = " + Boa.numBoa);
//            System.out.println("Boar = " + Boar.numBoar);
//            System.out.println("Buffalo = " + Buffalo.numBuffalo);
//            System.out.println("Deer = " + Deer.numDeer);
//            System.out.println("Goat = " + Goat.numGoat);
//            System.out.println("Horse = " + Horse.numHorse);
//            System.out.println("Mouse = " + Mouse.numMouse);
//            System.out.println("Rabbit = " + Rabbit.numRabbit);
//            System.out.println("Sheep = " + Sheep.numSheep);
            //System.out.println(cell.getAnimalList());


//        }
    }
}
