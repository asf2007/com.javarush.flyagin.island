package organism;

import field.Cell;

import java.lang.reflect.InvocationTargetException;

public interface Reproduseble {
    public boolean reproduce(Cell cell) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
