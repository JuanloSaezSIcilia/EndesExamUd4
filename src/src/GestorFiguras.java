package src;

import java.util.ArrayList;

public class GestorFiguras {

    public ArrayList<Object> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Object f) {
        figuras.add(f);
    }

    public void mostrarAreas() {

        for (Object f : figuras) {

            // horrible uso de instanceof
            if (f instanceof Circulo) {
                Circulo Circulo = (Circulo) f;
                System.out.println("Area circulo: " + Circulo.calcularArea());
            }

            if (f instanceof Rectangulo) {
                Rectangulo Rectangulo = (Rectangulo) f;
                System.out.println("Area rectangulo: " + Rectangulo.calcularArea());
            }

            if (f instanceof Triangulo) {
                Triangulo Triangulo = (Triangulo) f;
                System.out.println("Area triangulo: " + Triangulo.calcularArea());
            }
        }
    }

    public void mostrarPerimetros() {

        for (Object f : figuras) {

            if (f instanceof Circulo) {
                Circulo Circulo = (Circulo) f;
                System.out.println("Perimetro circulo: " + Circulo.calcularPerimetro());
            }

            if (f instanceof Rectangulo) {
                Rectangulo Rectangulo = (Rectangulo) f;
                System.out.println("Perimetro rectangulo: " + Rectangulo.calcularPerimetro());
            }

            if (f instanceof Triangulo) {
                Triangulo Triangulo = (Triangulo) f;
                System.out.println("Perimetro triangulo: " + Triangulo.calcularPerimetro());
            }
        }
    }

    public void dibujarTodo() {

        for (Object f : figuras) {

            if (f instanceof Circulo) {
                ((Circulo) f).dibujar();
            }

            if (f instanceof Rectangulo) {
                ((Rectangulo) f).dibujar();
            }

            if (f instanceof Triangulo) {
                ((Triangulo) f).dibujar();
            }
        }
    }
}