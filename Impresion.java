public class Impresion extends Producto {
    private String tipoImpresion; // Puede ser "Color" o "Blanco y Negro"
    private String modeloCamara; // Modelo de la cámara utilizada
    private String fichero; // Nombre del fichero

    public Impresion(String nombre, int numeroProducto, String tipoImpresion, String modeloCamara, String fichero) {
        super(nombre, numeroProducto);
        this.tipoImpresion = tipoImpresion;
        this.modeloCamara = modeloCamara; // Inicializa el modelo de la cámara
        this.fichero = fichero; // Inicializa el fichero
    }

    // Getters y Setters
    public String getTipoImpresion() {
        return tipoImpresion;
    }

    public void setTipoImpresion(String tipoImpresion) {
        this.tipoImpresion = tipoImpresion;
    }

    public String getModeloCamara() {
        return modeloCamara;
    }

    public void setModeloCamara(String modeloCamara) {
        this.modeloCamara = modeloCamara;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de impresión: " + tipoImpresion);
        System.out.println("Modelo de la cámara: " + modeloCamara);
        System.out.println("Fichero: " + fichero);
    }
}

