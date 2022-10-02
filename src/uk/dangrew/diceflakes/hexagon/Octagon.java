package uk.dangrew.diceflakes.hexagon;

public class Octagon implements Shape {

    private static final double SCALE = 3.0;

    private static final double[][] coordinates = new double[][]{
            {38 * SCALE,	-92 * SCALE},
            {-38 * SCALE,	-92 * SCALE},
            {-92 * SCALE,	-38 * SCALE},
            {-92 * SCALE,	38 * SCALE},
            {-38 * SCALE,	92 * SCALE},
            {38 * SCALE,	92 * SCALE},
            {92 * SCALE,	38 * SCALE},
            {92 * SCALE, -38 * SCALE}
    };

    @Override
    public int edges() {
        return 8;
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
