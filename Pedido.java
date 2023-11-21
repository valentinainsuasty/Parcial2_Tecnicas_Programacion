import java.util.Scanner;
public class Pedido {
    /**
     *
     * @param args
     * Complejidad temporal: 0(1) tiempo constante
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
    String nombre = scanner.nextLine();

        System.out.println("Ingrese su direccion: ");
    String color = scanner.nextLine();

    System.out.println("Ingrese su pedido: ");
        String pedido = scanner.nextLine();

        Producto miProducto = new Producto("celular", "AS", 750.000, 10);
        Cliente miCliente = new Cliente("Valentina", "calle #100", 1);
    }


}
