package records;

final class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() {
        return length;
    }

    double width() {
        return width;
    }
}
