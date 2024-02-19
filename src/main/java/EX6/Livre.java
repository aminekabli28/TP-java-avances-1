package EX6;

class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = false;
    }

    @Override
    public void emprunter() {
        if (!emprunte) {
            System.out.println("Emprunt du livre '" + titre + "' de " + auteur);
            emprunte = true;
        } else {
            System.out.println("Le livre '" + titre + "' de " + auteur + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            System.out.println("Retour du livre '" + titre + "' de " + auteur);
            emprunte = false;
        } else {
            System.out.println("Le livre '" + titre + "' de " + auteur + " n'est pas emprunté.");
        }
    }
}
