import java.math.*;

public class Cerchio {
    // attributi
    private int raggio;

    // metodi
    public Cerchio (int raggio) {   // raggio é il parametro
        this.raggio = raggio;    // this.raggio si riferisce alla variabile istanza
    }

    public double circonferenza () {
        double circonferenza;
        circonferenza = 2 * Math.PI * raggio;
        return circonferenza;
    }
    public double area () {
        double area;
        area = Math.PI * Math.pow (raggio, 2);
        return area;
    }
}
