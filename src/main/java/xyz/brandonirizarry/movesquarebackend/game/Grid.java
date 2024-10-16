package xyz.brandonirizarry.movesquarebackend.game;

import java.util.Arrays;

class Grid {
    private final Cell[][] grid;
    private int rowCoord = 0;
    private int columnCoord = 0;
    private final int numRows;
    private final int numColumns;

    Grid(int numRows, int numColumns) {
        this.grid = new Cell[numRows][numColumns];

        for (var row : grid) {
            Arrays.fill(row, Cell.Empty);
        }

        this.grid[rowCoord][columnCoord] = Cell.Player;

        this.numRows = numRows;
        this.numColumns = numColumns;
    }

    void move(int deltaRow, int deltaColumn) {
        // Erase old position.
        this.grid[rowCoord][columnCoord] = Cell.Empty;

        // Update coordinates.
        this.rowCoord += deltaRow;
        this.columnCoord += deltaColumn;

        // Snap coordinates if necessary.
        this.rowCoord = Math.max(Math.min(this.rowCoord, this.numRows - 1), 0);
        this.columnCoord = Math.max(Math.min(this.columnCoord, this.numColumns - 1), 0);

        // Draw at updated position.
        this.grid[rowCoord][columnCoord] = Cell.Player;
    }

    Cell[][] export() {
        var gridCopy = new Cell[this.numRows][this.numColumns];

        for (var rowIndex = 0; rowIndex < this.numRows; rowIndex++) {
            System.arraycopy(this.grid[rowIndex], 0, gridCopy[rowIndex], 0, this.numColumns);
        }

        return gridCopy;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();

        for (var row : this.grid) {
            for (var cell : row) {
                builder.append(cell.getSymbol());
            }

            builder.append('\n');
        }

        return builder.toString();
    }
}
