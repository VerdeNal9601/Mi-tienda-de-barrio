import java.lang.invoke.StringConcatFactory;

public class articulos {
    int articulo;
    String nombre;
    String marca;
    String stock;

    public articulos(int articulo, String nombre, String marca, String stock) {
        this.articulo = articulo;
        this.nombre = nombre;
        this.marca = marca;
        this.stock = stock;
    }

    public int getArticulo() {
        return articulo;
    }

    public void setArticulo(int articulo) {
        this.articulo = articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "articulos{" +
                "articulo=" + articulo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
