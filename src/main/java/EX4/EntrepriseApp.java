package EX4;

public class EntrepriseApp {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("Doe", "John", "john.doe@example.com", "0123456789", 50000, "Développement");
        Manager manager = new Manager("Smith", "Jane", "jane.smith@example.com", "9876543210", 60000, "Ressources humaines");

        System.out.println("Informations de l'ingénieur:");
        System.out.println("Nom: " + ingenieur.nom);
        System.out.println("Prénom: " + ingenieur.prenom);
        System.out.println("Salaire: " + ingenieur.calculerSalaire());
        System.out.println("Spécialité: " + ingenieur.getSpecialite());

        System.out.println("\nInformations du manager:");
        System.out.println("Nom: " + manager.nom);
        System.out.println("Prénom: " + manager.prenom);
        System.out.println("Salaire: " + manager.calculerSalaire());
        System.out.println("Service: " + manager.getService());
    }
}
