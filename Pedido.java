import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Date fecha;
    private ArrayList<Producto> productos;

    public Pedido(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    // Añadir un producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Imprimir la información completa del pedido
    public void imprimirPedido() {
        System.out.println("Pedido realizado por: ");
        cliente.mostrarInfo();
        System.out.println("Fecha del pedido: " + fecha);
        
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
}
