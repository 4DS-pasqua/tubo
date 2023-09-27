import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float lung, diam;
        boolean error = false;
        Tubo tubo1 = null;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.print("Inserire lunghezza tubo: ");
                lung = input.nextFloat();
                System.out.print("\nInserire diametro tubo: ");
                diam = input.nextFloat();
                tubo1 = new Tubo(diam, lung);
                error = false;
            } catch(Exception e) {
                System.out.print(e.getMessage());
                error = true;
            }
        } while(error);
    }
}