package field;

public class Field {
    private int xSize = 10;
    private int ySize = 10;

    private Cell[][] field = new Cell[xSize][ySize];

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public Cell[][] getField() {
        return field;
    }
    public Field fillField(Field field){
        for (int i = 0; i < field.getField().length; i++) {
            for (int j = 0; j < field.getField()[i].length; j++) {
                field.getField()[i][j] = new Cell(this, i,j);
            }
        }
        return field;
    }

}
