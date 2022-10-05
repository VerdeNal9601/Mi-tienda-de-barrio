public class devoluciones {
    int idDevolucion;
    int cantidad;
    int idArticulo;

    public devoluciones(int idDevolucion, int cantidad, int idArticulo) {
        this.idDevolucion = idDevolucion;
        this.cantidad = cantidad;
        this.idArticulo = idArticulo;
    }

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public String toString() {
        return "devoluciones{" +
                "idDevolucion=" + idDevolucion +
                ", cantidad=" + cantidad +
                ", idArticulo=" + idArticulo +
                '}';
    }
}
