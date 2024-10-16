package xyz.brandonirizarry.movesquarebackend.game;

public enum Cell {
    Player('X'), Empty('-');

    private final char symbol;

    Cell(char ch) {
        this.symbol = ch;
    }

    public char getSymbol() {
        return this.symbol;
    }
}
