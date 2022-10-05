public class clientes {

    String armandoPerez;
    String gloriaCalle;
    String HernandoCastro;
    String camiloTorres;

    public clientes(String armandoPerez, String gloriaCalle, String hernandoCastro, String camiloTorres) {
        this.armandoPerez = armandoPerez;
        this.gloriaCalle = gloriaCalle;
        HernandoCastro = hernandoCastro;
        this.camiloTorres = camiloTorres;
    }

    public String getArmandoPerez() {
        return armandoPerez;
    }

    public void setArmandoPerez(String armandoPerez) {
        this.armandoPerez = armandoPerez;
    }

    public String getGloriaCalle() {
        return gloriaCalle;
    }

    public void setGloriaCalle(String gloriaCalle) {
        this.gloriaCalle = gloriaCalle;
    }

    public String getHernandoCastro() {
        return HernandoCastro;
    }

    public void setHernandoCastro(String hernandoCastro) {
        HernandoCastro = hernandoCastro;
    }

    public String getCamiloTorres() {
        return camiloTorres;
    }

    public void setCamiloTorres(String camiloTorres) {
        this.camiloTorres = camiloTorres;
    }

    @Override
    public String toString() {
        return "clientes{" +
                "armandoPerez='" + armandoPerez + '\'' +
                ", gloriaCalle='" + gloriaCalle + '\'' +
                ", HernandoCastro='" + HernandoCastro + '\'' +
                ", camiloTorres='" + camiloTorres + '\'' +
                '}';
    }
}
