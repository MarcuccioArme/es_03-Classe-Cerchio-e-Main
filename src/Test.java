import java.util.Scanner;

public class Test {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        Cerchio c1, c2, c3, c4;
        int r1, r2, r3, r4;
        double x1, x2, x3, x4;
        double y1, y2, y3, y4;

        System.out.println("Inserisci il raggio di C1: ");
        r1 = in.nextInt();
        System.out.println("Inserisci la coordinata X di C1: ");
        x1 = in.nextDouble();
        System.out.println("Inserisci la coordinata Y di C1: ");
        y1 = in.nextDouble();

        System.out.println("Inserisci il raggio di C2: ");
        r2 = in.nextInt();
        System.out.println("Inserisci la coordinata X di C2: ");
        x2 = in.nextDouble();
        System.out.println("Inserisci la coordinata Y di C2: ");
        y2 = in.nextDouble();

        System.out.println("Inserisci il raggio di C3: ");
        r3 = in.nextInt();
        System.out.println("Inserisci la coordinata X di C3: ");
        x3 = in.nextDouble();
        System.out.println("Inserisci la coordinata Y di C3: ");
        y3 = in.nextDouble();

        System.out.println("Inserisci il raggio di C4: ");
        r4 = in.nextInt();
        System.out.println("Inserisci la coordinata X di C4: ");
        x4 = in.nextDouble();
        System.out.println("Inserisci la coordinata Y di C4: ");
        y4 = in.nextDouble();

        c1 = new Cerchio(r1);
        c2 = new Cerchio(r2);
        c3 = new Cerchio(r3);
        c4 = new Cerchio(r4);

        System.out.println ("Circonferenza di c1: " + c1.circonferenza());
        System.out.println ("Circonferenza di c2: " + c2.circonferenza());
        System.out.println ("Circonferenza di c3: " + c3.circonferenza());
        System.out.println ("Circonferenza di c4: " + c4.circonferenza());

        System.out.println ("Area di c1: " + c1.area());
        System.out.println ("Area di c2: " + c2.area());
        System.out.println ("Area di c3: " + c3.area());
        System.out.println ("Area di c4: " + c4.area());

    }
}
