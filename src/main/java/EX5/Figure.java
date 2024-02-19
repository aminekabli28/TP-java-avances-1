package EX5;

abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public void afficherDetails() {
        System.out.println("Nom de la figure: " + nom);
        System.out.println("Aire de la figure: " + calculerAire());
        System.out.println("Périmètre de la figure: " + calculerPerimetre());
    }
}