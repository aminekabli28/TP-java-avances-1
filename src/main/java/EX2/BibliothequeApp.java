package EX2;

public class BibliothequeApp {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Doe", "John", "john.doe@example.com", "0123456789", 30, 12345);
        Auteur auteur = new Auteur("Smith", "Jane", "jane.smith@example.com", "9876543210", 45, 54321);
        Livre livre = new Livre(123456789, "Titre du livre", auteur);

        System.out.println("Informations de l'adhérent:");
        System.out.println(adherent.toString());

        System.out.println("\nInformations du livre:");
        System.out.println(livre.toString());
    }
}
