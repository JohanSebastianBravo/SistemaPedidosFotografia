public class Cliente {
    private String nombre;
    private String cedula; // Añadimos la cédula
    private String numeroTarjeta; // Añadimos el número de tarjeta

    public Cliente(String nombre, String cedula, String numeroTarjeta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroTarjeta = numeroTarjeta;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + ", Cédula: " + cedula + ", Número de tarjeta: " + numeroTarjeta);
    }
}
