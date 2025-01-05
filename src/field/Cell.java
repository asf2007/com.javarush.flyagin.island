package field;

import organism.Animal;
import organism.Plant;
import organism.herbivore.*;
import organism.predator.*;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell  {
private List<Animal> animalList = new CopyOnWriteArrayList<Animal>(new ArrayList<Animal>());
private List<Animal> childes =new ArrayList<>(Arrays.asList( new Fox(), new Wolf(),   new Fox(), new Wolf(),new Bear(), new Boa(), new Eagle(), new Boar(), new Buffalo()
        , new Deer(), new Goat(), new Horse(), new Mouse(), new Rabbit(), new Sheep(), new Fox(), new Wolf(), new Bear(), new Boa(), new Eagle(), new Boar(), new Buffalo()
        ,new Deer(), new Goat(), new Horse(), new Mouse(), new Rabbit(), new Sheep(), new Goat(), new Horse(), new Mouse(), new Rabbit(), new Caterpillar(), new Caterpillar(),new Caterpillar(),new Caterpillar(),new Caterpillar(),new Caterpillar(),new Caterpillar()//new Duck()//,new Caterpillar(), new Duck()
));

    public  List<Animal> getChildes() {
        return childes;
    }
    private Field field;

    public Cell(Field field, int coordinateX, int coordinateY) {
        this.field = field;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Field getField() {
        return field;
    }

    private volatile double  plant = Plant.maxNum;

    public double getPlant() {
        return plant;
    }

    public void addPlant(){
        plant += Plant.newPlant;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void setPlant(double plant) {
        this.plant = plant;
    }

    private int coordinateX;
    private int coordinateY;


    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
