package courrier;

public class Lettre extends Courrier  {

    //attributs spécifiques aux lettres:
    protected String format = "";

    public Lettre(double poids, boolean express, String adresse, String format){
        super(poids, express, adresse);
        this.format = format;
    }

    // redéfinit affranchirNormal()
    protected double affranchirNormal() {
        double montant = 0;
        if (format.equals("A4")){
            montant = 2.0;
        } else {
            montant = 3.5;
        }
        montant += poids/1000.0;
        return montant;
    }

    // inutile de redéfinir la méthode valide() pour les  lettres

    @Override
    public String toString() {
        String s = "Lettre\n";
        s += super.toString();
        s += "	Format : " + format + "\n";
        return s;
    }


}
