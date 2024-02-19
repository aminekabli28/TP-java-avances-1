package EX6;

class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = false;
    }

    @Override
    public void emprunter() {
        if (!emprunte) {
            System.out.println("Emprunt du DVD '" + titre + "' réalisé par " + realisateur);
            emprunte = true;
        } else {
            System.out.println("Le DVD '" + titre + "' réalisé par " + realisateur + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            System.out.println("Retour du DVD '" + titre + "' réalisé par " + realisateur);
            emprunte = false;
        } else {
            System.out.println("Le DVD '" + titre + "' réalisé par " + realisateur + " n'est pas emprunté.");
        }
    }
}
