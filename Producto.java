public class Producto {
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidadInventario;

    /**
     *
     * @param nombreProducto
     * @param descripcion
     * @param precio
     * @param cantidadInventario
     *
     * Complejidad temporal: 0(1) tiempo constante
     */

    public Producto(String nombreProducto, String descripcion, double precio, int cantidadInventario){
        this.nombreProducto= nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    /**
     *
     * @param nombreCliente
     * @param direccion
     * Complejidad temporal: 0(1) tiempo constante
     */
    public Producto(String nombreCliente, String direccion) {
    }

    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */

    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */

    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    /**
     *
     * @param nombre
     * Complejidad temporal: 0(1) tiempo constante
     */

    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
    }

    /**
     *
     * @param descripcion
     * Complejidad temporal: 0(1) tiempo constante
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @param precio
     * Complejidad temporal: 0(1) tiempo constante
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @param cantidadInventario
     * Complejidad temporal: 0(1) tiempo constante
     */

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
}
