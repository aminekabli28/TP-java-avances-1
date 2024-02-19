package EX3;

class Moto extends Vehicule {
    private String marque;
    private int puissance;

    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    public void emettreSon() {
        System.out.println("La moto rugit.");
    }
}
