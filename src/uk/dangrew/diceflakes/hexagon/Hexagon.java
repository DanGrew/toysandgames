package uk.dangrew.diceflakes.hexagon;

public class Hexagon implements Shape {

    private static final double WIDTH = 250;
    private static final double X_COMPONENT = WIDTH / 2;
    private static final double Y_COMPONENT = Math.sqrt(3) * X_COMPONENT;

    private static final double[][] coordinates = new double[][]{
            {WIDTH, 0}, //A, right, moving counter-clockwise
            {X_COMPONENT, Y_COMPONENT}, //B
            {-X_COMPONENT, Y_COMPONENT}, //C
            {-WIDTH, 0}, //D, left
            {-X_COMPONENT, -Y_COMPONENT}, //E
            {X_COMPONENT, -Y_COMPONENT} //F
    };

    @Override
    public int edges() {
        return 6;
    }

    @Override
    public int xFor(int diceValue) {
        return (int) coordinates[diceValue - 1][0];
    }

    @Override
    public int yFor(int diceValue) {
        return (int) coordinates[diceValue - 1][1];
    }
}
