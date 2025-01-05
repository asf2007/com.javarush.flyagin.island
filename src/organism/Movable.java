package organism;


import field.Cell;
import field.Field;

public interface Movable {
    public void move(Cell cell, Field field);
}
