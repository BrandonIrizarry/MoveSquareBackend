package xyz.brandonirizarry.movesquarebackend.game;

// "Maximum porcelain, minimum state."
public class Game {
    private final Grid grid;

    public Game(int numRows, int numColumns) {
        this.grid = new Grid(numRows, numColumns);
    }

    public void moveNorth() {
        grid.move(-1, 0);
    }

    public void moveSouth() {
        grid.move(1, 0);
    }

    public void moveWest() {
        grid.move(0, -1);
    }

    public void moveEast() {
        grid.move(0, 1);
    }

    public void moveNorthWest() {
        grid.move(-1, -1);
    }

    public void moveNorthEast() {
        grid.move(-1, 1);
    }

    public void moveSouthWest() {
        grid.move(1, -1);
    }

    public void moveSouthEast() {
        grid.move(1, 1);
    }

    public Cell[][] export() {
        return this.grid.export();
    }

    public static void main(String[] args) {

    }
}
