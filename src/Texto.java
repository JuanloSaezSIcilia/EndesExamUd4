public abstract class Texto implements Avisable{
    protected String contenido;
    boolean isUrgente;
    protected TipoConversion conversion;

    public Texto(String contenido, boolean isUrgente, TipoConversion conversion) {
        if (contenido == null){
            throw new IllegalArgumentException("El contenido no puede ser null");
        } else if (contenido == "") {
            throw new CadenaVaciaException("La cadena no puede estar vacia");
        }
        this.contenido = contenido;
        this.isUrgente = isUrgente;
        setConversion(conversion);
    }

    public Texto(String contenido, TipoConversion conversion) {
        this.contenido = contenido;
        this.conversion = conversion;
        isUrgente = false;
    }


    public Texto(String contenido, boolean isUrgente) {
        this.contenido = contenido;
        this.isUrgente = isUrgente;
        conversion = TipoConversion.NINGUNA;
    }

    public Texto(String contenido) {
        this.contenido = contenido;
        conversion = TipoConversion.NINGUNA;
        isUrgente = false;
    }

    public TipoConversion getConversion() {
        return conversion;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean isUrgente() {
        return isUrgente;
    }

    public void setConversion(TipoConversion conversion) {
        if (conversion == null){
            throw new IllegalArgumentException("Conversion no puede ser null");
        }
        this.conversion = conversion;
    }

    @Override
    public void visualizar() {
        if (conversion == TipoConversion.NINGUNA){
            System.out.println(contenido +"(NINGUNA)");
        } else if (conversion == TipoConversion.MINUSCULAS) {
            System.out.println(contenido.toLowerCase() +"(MINUSCULAS)");
        } else if (conversion == TipoConversion.MAYUSCULAS) {
            System.out.println(contenido.toUpperCase() +"MAYUSCULAS");
        }
    }
}



