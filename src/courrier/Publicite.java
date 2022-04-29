package courrier;

public class Publicite extends Courrier {
    public Publicite(double poids, boolean express, String adresse){
        super(poids, express, adresse);
    }

    // redéfinit affranchirNormal()
    protected double affranchirNormal() {
        return poids/1000.0 * 5.0;
    }


    // inutile de red'efinir la méthode valide() pour les  publicités

    @Override
    public String toString() {
        String s = "Publicité\n";
        s += super.toString();
        return s;
    }


    public double estCommercial() {//calcule la déduction appliquée au courrier commercial

        return 0.20;
    }

    @Override
    public double affranchir() {
       double total = super.affranchir();
       total -= super.affranchir() * estCommercial();
       return total;
    }
}
