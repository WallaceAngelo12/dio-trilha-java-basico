public record Rectangle(double base, double height ) implements GeometricArea {

    public double getArea() {
        return height * base;
    }
}
