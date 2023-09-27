import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float lung, diam;
        boolean error = false;
        int sel;
        Tubo tubo1 = null;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.print("\nInserire lunghezza tubo: ");
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

       do {
           do {
               System.out.print("\n0. Esci\n1. Visualizza tubo\n2. Visualizza superficie del tubo\n3. Visualizza volume del tubo\nSeleziona: ");
               sel = input.nextInt();
           } while(sel < 0 && sel > 3);
           switch (sel) {
               case 1:
                   System.out.print(tubo1);
                   break;
               case 2:
                   System.out.printf("%.2f", tubo1.superficie());
                   break;
               case 3:
                   System.out.printf("%.2f", tubo1.volume());
                   break;
           }
       } while(sel != 0);
    }
}