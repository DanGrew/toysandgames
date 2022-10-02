package uk.dangrew.diceflakes.hexagon;

public class Pentagon implements Shape {

    private static final double[][] coordinates = new double[][]{
            {0, -100},
            {-95, -31},
            {-59, 81},
            {59, 81},
            {95, -31}
    };

    @Override
    public int edges() {
        return 5;
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
