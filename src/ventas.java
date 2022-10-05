public class ventas {
    int idVenta;
    int documento;
    int idarticulo;

    public ventas(int idVenta, int documento, int idarticulo) {
        this.idVenta = idVenta;
        this.documento = documento;
        this.idarticulo = idarticulo;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    @Override
    public String toString() {
        return "ventas{" +
                "idVenta=" + idVenta +
                ", documento=" + documento +
                ", idarticulo=" + idarticulo +
                '}';
    }
}
