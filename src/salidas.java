public class salidas {

    int idsalida;
    int cantidad;
    int valorUnidad;
    String fecha;

    public salidas(int idsalida, int cantidad, int valorUnidad, String fecha) {
        this.idsalida = idsalida;
        this.cantidad = cantidad;
        this.valorUnidad = valorUnidad;
        this.fecha = fecha;
    }

    public int getIdsalida() {
        return idsalida;
    }

    public void setIdsalida(int idsalida) {
        this.idsalida = idsalida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    @Override
    public String toString() {
        return "salidas{" +
                "idsalida=" + idsalida +
                ", cantidad=" + cantidad +
                ", valorUnidad=" + valorUnidad +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
