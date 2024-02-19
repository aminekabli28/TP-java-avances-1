package EX5;

public class FigureApp {
    public static void main(String[] args) {
        Figure cercle = new Cercle("Cercle", 5);
        Figure rectangle = new Rectangle("Rectangle", 4, 6);

        cercle.afficherDetails();
        System.out.println();
        rectangle.afficherDetails();
    }
}