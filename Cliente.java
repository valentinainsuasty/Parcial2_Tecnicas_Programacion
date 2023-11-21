public class Cliente extends Producto{

    private String nombreCliente;
    private String direccion;
    private int listaPedido;

    /**
     *
     * @param nombreCliente
     * @param direccion
     * @param listaPedido
     * Complejidad temporal: 0(1) tiempo constante
     */
    public Cliente( String nombreCliente, String direccion,  int listaPedido){
        super(nombreCliente, direccion);
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.listaPedido = listaPedido;
    }
    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */

    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */

    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */

    public int getListaPedido() {
        return listaPedido;
    }

    /**
     *
     * @param nombreCliente
     * Complejidad temporal: 0(1) tiempo constante
     */

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     *
     * @param direccion
     * Complejidad temporal: 0(1) tiempo constante
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @param listaPedido
     * Complejidad temporal: 0(1) tiempo constante
     */

    public void setListaPedido(int listaPedido) {
        this.listaPedido = listaPedido;
    }
}


