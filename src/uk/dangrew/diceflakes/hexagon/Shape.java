package uk.dangrew.diceflakes.hexagon;

public interface Shape {

    public int edges();

    public int xFor(int diceValue);

    public int yFor(int diceValue);
}
