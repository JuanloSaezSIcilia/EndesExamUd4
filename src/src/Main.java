package src;

public class Main {

    public static void main(String[] args) {

        GestorFiguras gestor = new GestorFiguras();

        Circulo Circulo1 = new Circulo(5);
        Rectangulo Rectangulo1 = new Rectangulo(4, 6);
        Triangulo Triangulo1 = new Triangulo(3, 4, 3, 4, 5);

        gestor.agregarFigura(Circulo1);
        gestor.agregarFigura(Rectangulo1);
        gestor.agregarFigura(Triangulo1);

        System.out.println("---- AREAS ----");
        gestor.mostrarAreas();

        System.out.println("---- PERIMETROS ----");
        gestor.mostrarPerimetros();

        System.out.println("---- DIBUJAR ----");
        gestor.dibujarTodo();
    }
}