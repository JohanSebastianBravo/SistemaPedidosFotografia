import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n==============================");
        // Crear un cliente
        Cliente cliente = new Cliente("Salomón Villada Hoyos", "123456789", "987654321");

        // Crear productos de tipo impresión con modelo de cámara y fichero
        Impresion impresion1 = new Impresion("Foto.png", 1, "Color", "Canon EOS R", "Camara gran angular-38mm f2.5.jpg");
    
        Impresion impresion2 = new Impresion("Foto.png2", 2, "Blanco y Negro", "Nikon D3500", "IMG_1099 - 26mm 1080 X 1920.jpg");
        
        // Crear el pedido y asignar la fecha actual
        Pedido pedido = new Pedido(cliente, new Date());

        // Agregar productos al pedido
        pedido.agregarProducto(impresion1);
        pedido.agregarProducto(impresion2);

        // Imprimir la información del pedido
        pedido.imprimirPedido();

        
        System.out.println("         PothoMax         ");
        System.out.println("==============================\n");
    }
}
