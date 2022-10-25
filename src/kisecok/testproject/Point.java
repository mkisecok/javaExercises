package kisecok.testproject;

public class Point extends Circle {

    public double getCircuit() {
        Circle circle = new Circle();
        return 2 * 3.14 * circle.getRadius();
    }

    @Override
    protected int getRadius() {
        return 0;
    }
}
