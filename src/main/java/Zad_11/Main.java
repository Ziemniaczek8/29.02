package Zad_11;

public class Main {

    /* ZADANIE 11.
Stwórz interfejs Resizable posiadający metodę resize(double resizeFactor).
Zaimplementuj interfejs w klasie z poprzedniego zadania (Circle).
Przy wywołaniu metody resize(doubleresizeFactor), okrąg ma zmienić swoje rozmiary o zadany współczynnik (1.5, 0.5, 10.0, itp).
Sprawdź poprawność zmiany rozmiaru wywołując pozostałe metody klasy Circle. */

    public static void main(String[] args) {

        Point2D ctr = new Point2D(4, 3);
        Point2D pnt = new Point2D(8, 10);

        Circle circle = new Circle(ctr, pnt);

        double radius = circle.getRadius();
        System.out.println(radius);
        System.out.println("--------------");

        System.out.println(circle.getPerimeter());

        System.out.println("---------------------");
        System.out.println(circle.getArea());



        // do rozwjązania Damiana implementacje: // metoda resize do klasy Circle

        /* Piotra
        * Ja mam taką implementację:

	@Override
	public void resize(double resizeFactor) {
		this.point.setX(
				this.center.getX() + resizeFactor * (this.point.getX() - this.center.getX()));
		this.point.setY(
				this.center.getY() + resizeFactor * (this.point.getY() - this.center.getY()));

	}*/



    }
}
