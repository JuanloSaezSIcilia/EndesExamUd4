/*Hemos arreglado el package que ahora funciona de forma correcta*/
package src;

public class Circulo {
/*hemos Encapsulado de mejor forma esta clase de circulo*/
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 3.1416 * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * 3.1416 * radio;
    }

    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }
}