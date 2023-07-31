
package u02prac13claseabstracta;

/**
 *
 * @author Personal
 */
public abstract class Figura {
    double x;
    double y;

    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
}

