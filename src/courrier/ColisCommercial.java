package courrier;

public class ColisCommercial extends Colis implements Commercial{
    public ColisCommercial(double poids, boolean express, String adresse, double volume) {
        super(poids, express, adresse, volume);
    }

    @Override
    public double estCommercial() {
        return 0.15;
    }
    @Override
    public String toString(){
        String s = super.toString();
        s += "Colis commercial";
        return s;
    }
    @Override
    public double affranchir(){
        double total = super.affranchir() ;
        total -= super.affranchir() * estCommercial();
        return total;
    }
}
