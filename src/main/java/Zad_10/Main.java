package Zad_10;

public class Main {

    /* ZADANIE 10.
Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i konstruktor.
Stwórz interfejs Movable posiadający metodę move(MoveDirection moveDirection).
Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle).
Przy wywołaniu metody move(MoveDirection moveDirection), obiekty mają zmienić swoje położenie
na podstawie przekazanego kierunku (MoveDirection).
Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle. */


    public static void main(String[] args) {

        MoveDirection moveDirection = new MoveDirection(5, 10);

        Point2D ctr = new Point2D(4, 3);
        Point2D pnt = new Point2D(8, 10);

        ctr.move(moveDirection);   // cale zadanie zle...nie o to chodzi

        Circle circle = new Circle(ctr, pnt);

        double radius = circle.getRadius();
        System.out.println(radius);
        System.out.println("--------------");

        System.out.println(circle.getPerimeter());

        System.out.println("---------------------");
        System.out.println(circle.getArea());
    }
}
