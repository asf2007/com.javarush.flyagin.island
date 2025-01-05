import Settings.Settings;
import field.Cell;
import field.CellTask;
import game.Play;
import organism.Animal;
import organism.Plant;
import organism.herbivore.*;
import organism.predator.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

//        Animal an = new Wolf();
//        Cell cell = new Cell();


//        List<Animal> animals = new ArrayList<>(Arrays.asList( new Fox(), new Wolf(),   new Fox(), new Wolf(),new Bear(), new Boa(), new Eagle(), new Boar(), new Buffalo()
//               , new Deer(), new Goat(), new Horse(), new Mouse(), new Rabbit(), new Sheep(), new Fox(), new Wolf(), new Bear(), new Boa(), new Eagle(), new Boar(), new Buffalo()
//                ,new Deer(), new Goat(), new Horse(), new Mouse(), new Rabbit(), new Sheep()
//        ));

//        cell.setAnimalList(animals);
//        CellTask cellTask = new CellTask(cell);
//        cellTask.run();
        new Play().gameWorker();













    }
}