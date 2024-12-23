public class Producto {
    private String nombre;
    private int numeroProducto; // Eliminamos el precio

    public Producto(String nombre, int numeroProducto) {
        this.nombre = nombre;
        this.numeroProducto = numeroProducto;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Número de producto: " + numeroProducto);
    }
}
