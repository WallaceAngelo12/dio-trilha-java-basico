public record Circle(double radius) implements GeometricArea {

    private static final double PI = 3.14;

    public double getArea() {
        return  PI * (radius * radius);
    }
}
