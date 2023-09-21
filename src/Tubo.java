public class Tubo {
    private float lunghezza;
    private float diametro;

    public Tubo(float diametro, float lunghezza) throws Exception {
        if(diametro < 0) {
            throw new Exception("\nDiametro non valido!");
        } else {
            if(lunghezza < 0) {
                lunghezza = lunghezza * -1;
            }
            this.lunghezza = lunghezza;
            this.diametro = diametro;
        }
    }
}
