package game;

import field.AddAnimalsToCellTask;
import field.Cell;
import field.CellTask;
import field.Field;
import organism.Plant;
import organism.herbivore.*;
import organism.predator.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Play {
    private Field field;
    private ArrayList<CellTask> cellTasks = new ArrayList<>();
    private ArrayList<AddAnimalsToCellTask> addTasks = new ArrayList<>();


    public void gameWorker() throws InterruptedException {
        field = new Field();
        field = field.fillField(field);
        int fieldSize = field.getxSize()*field.getySize();
        ExecutorService executorService = Executors.newFixedThreadPool(fieldSize);
        for (int y = 0; y < 30; y++) {
            CountDownLatch countDownLatchCellTask = new CountDownLatch(fieldSize);
            CountDownLatch countDownLatchAddToCell = new CountDownLatch(fieldSize);


            for (int i = 0; i < field.getField().length; i++) {
                for (int j = 0; j < field.getField()[i].length; j++) {
                    cellTasks.add(new CellTask(field.getField()[i][j]));
                }
            }

            for (CellTask cellTask : cellTasks) {
                cellTask.setCountDownLatch(countDownLatchCellTask);
                executorService.submit(cellTask);
            }
            cellTasks.clear();
            countDownLatchCellTask.await();
            for (int i = 0; i < field.getField().length; i++) {
                for (int j = 0; j < field.getField()[i].length; j++) {
                    addTasks.add(new AddAnimalsToCellTask(field.getField()[i][j]));
                }
            }
            for (AddAnimalsToCellTask addAnimalsToCellTask : addTasks) {
                addAnimalsToCellTask.setCountDownLatch(countDownLatchAddToCell);
                executorService.submit(addAnimalsToCellTask);

            }

            System.out.println("DAY = " + y + "-----------------------------------------------" );


            System.out.print("Plant = " + Plant.sumPlant + "; ");
            System.out.print("Wolf = " + Wolf.numWolfs + "; ");
            System.out.print("Fox = " + Fox.numFox + "; ");
            System.out.print("Eagle = " + Eagle.numEagle + "; ");
            System.out.print("Bear = " + Bear.numBear + "; ");
            System.out.print("Boa = " + Boa.numBoa + "; ");
            System.out.print("Boar = " + Boar.numBoar + "; ");
            System.out.print("Buffalo = " + Buffalo.numBuffalo + "; ");
            System.out.print("Deer = " + Deer.numDeer + "; ");
            System.out.print("Goat = " + Goat.numGoat + "; ");
            System.out.print("Horse = " + Horse.numHorse + "; ");
            System.out.print("Mouse = " + Mouse.numMouse + "; ");
            System.out.print("Rabbit = " + Rabbit.numRabbit + "; ");
            System.out.print("Sheep = " + Sheep.numSheep + "; ");
            System.out.print("Caterpillar = " + Caterpillar.numCaterpillar + "; ");
            System.out.print("Duck = " + Duck.numDuck + "; ");
            System.out.println();
            Plant.sumPlant = 0;

        }
        executorService.shutdown();
    }
}
