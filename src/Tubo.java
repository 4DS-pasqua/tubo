public class Tubo {
    private float lunghezza;
    private float diametro;

    public Tubo(float diametro, float lunghezza) throws Exception {
        if(diametro < 0) {
            throw new Exception("\nDiametro non valido!");
        } else if(lunghezza == 0) {
            throw new Exception("\nLunghezza non valida!");
        } else {
            if(lunghezza < 0) {
                lunghezza = lunghezza * -1;
            }
            this.lunghezza = lunghezza;
            this.diametro = diametro;
        }
    }

    public String toString() {
        return "\nLunghezza: " + lunghezza + "\nDiametro: " + diametro +"\n";
    }

    public float getDiametro() {
        return diametro;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public double superficie() {
        return (((diametro*3.14)*lunghezza))+(3.14*(diametro/2)*(diametro/2));
    }

    public double volume() {
        return ((3.14*(diametro/2)*(diametro/2)*lunghezza));
    }
}
