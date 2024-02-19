package EX3;

public class VehiculeApp {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Ford", 25000, "Fiesta", 2022);
        Moto moto = new Moto("Honda", 8000, "CBR", 600);
        Avion avion = new Avion("Airbus A320", 80000000, "Air France", 900);

        System.out.println("Informations de la voiture:");
        voiture.emettreSon();
        voiture.afficherInformations();

        System.out.println("\nInformations de la moto:");
        moto.emettreSon();
        moto.afficherInformations();

        System.out.println("\nInformations de l'avion:");
        avion.emettreSon();
        avion.afficherInformations();
    }
}
