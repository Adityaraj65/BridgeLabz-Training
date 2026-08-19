package day14;

abstract class Shape {
    abstract double area();
    void describe() {
        System.out.println("Area of shape: " + area());
    }
}
class Square extends Shape {
    private double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    double area() {
        return side * side;
    }
}

class AnonymousInnerClasses {
    public static void main(String[] args) {

        // Named subclass approach
        Shape namedSquare = new Square(5);
        // Anonymous inner class approach
        Shape anonTriangle = new Shape() {
            @Override
            double area() {
                return 0.5 * 6 * 4;
            }
        };

        namedSquare.describe();
        anonTriangle.describe();
    }
}