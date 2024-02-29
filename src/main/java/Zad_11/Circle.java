package Zad_11;

public class Circle implements Resizable{

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
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
    @Override
    public double resize(double resizeFactor) {
        return getRadius() * resizeFactor;
    }
}