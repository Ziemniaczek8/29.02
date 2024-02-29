package Zad_10;

public class Circle implements Movable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {

    }

    public double getRadius() {
        double radius = Math.sqrt((Math.pow(center.getX() - point.getX(), 2)) + (Math.pow(center.getY() - point.getY(), 2)));
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
