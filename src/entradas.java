public class entradas {
    int identrada;
    int valorUnidad;
    String fecha;


    public entradas(int identrada, int valorUnidad, String fecha, int cantidad) {
        this.identrada = identrada;
        this.valorUnidad = valorUnidad;
        this.fecha = fecha;

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





    @Override
    public String toString() {
        return "entradas{" +
                "identrada=" + identrada +
                ", valorUnidad=" + valorUnidad +
                ", fecha='" + fecha + '\'' +

                '}';
    }
}
gi