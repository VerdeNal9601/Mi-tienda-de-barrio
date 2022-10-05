public class entradas {
    int identrada;
    int valorUnidad;
    String fecha;
    int cantidad;

    public entradas(int identrada, int valorUnidad, String fecha, int cantidad) {
        this.identrada = identrada;
        this.valorUnidad = valorUnidad;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public int getIdentrada() {
        return identrada;
    }

    public void setIdentrada(int identrada) {
        this.identrada = identrada;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "entradas{" +
                "identrada=" + identrada +
                ", valorUnidad=" + valorUnidad +
                ", fecha='" + fecha + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
