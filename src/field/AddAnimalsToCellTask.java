package field;

import organism.Animal;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class AddAnimalsToCellTask implements Runnable{
    private Cell cell;
    private List<Animal> newOrganismAdd;
    private CountDownLatch countDownLatch;

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }


    public AddAnimalsToCellTask(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void run() {

        cell.getAnimalList().addAll(cell.getChildes());
        cell.getChildes().clear();
        countDownLatch.countDown();

    }
}
