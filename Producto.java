public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadInventario;

    /**
     *
     * @param nombre
     * @param descripcion
     * @param precio
     * @param cantidadInventario
     *
     * Complejidad temporal: 0(1) tiempo constante
     */

    public Producto(String nombre, String descripcion, double precio, int cantidadInventario){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    /**
     *
     * @return
     * Complejidad temporal: 0(1) tiempo constante
     */
    public String getNombre() {
        return nombre;
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
        this.nombre = nombre;
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
