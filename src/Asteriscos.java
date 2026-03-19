public class Asteriscos extends Texto {
protected int longitud;


    public Asteriscos(boolean isUrgente, String contenido, int longitud) {
        super(isUrgente, contenido);
        if (longitud <= 0){
            throw new IllegalArgumentException("la longitud no puede ser 0, ni negativo");
        }
        this.longitud = longitud;
    }

    @Override
    public void visualizar() {
        System.out.println("Asteriscos: ");
    }
}
