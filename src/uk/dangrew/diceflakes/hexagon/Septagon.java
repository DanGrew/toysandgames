package uk.dangrew.diceflakes.hexagon;

public class Septagon implements Shape {

    private static final double SCALE = 3.0;

    private static final double[][] coordinates = new double[][]{
            {0 * SCALE,	-100 * SCALE},
            {-78 * SCALE,	-62 * SCALE},
            {-97 * SCALE,	22 * SCALE},
            {-43 * SCALE,	90 * SCALE},
            {43 * SCALE,	90 * SCALE},
            {97 * SCALE,	22 * SCALE},
            {78 * SCALE,	-62 * SCALE}
    };

    @Override
    public int edges() {
        return 7;
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
