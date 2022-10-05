public class proveedores {
    String auralac;
    String colanta;
    String rama;
    String roa;

    public proveedores(String auralac, String colanta) {
        this.auralac = auralac;
        this.colanta = colanta;
        this.rama = rama;
        this.roa = roa;
    }

    public String getAuralac() {
        return auralac;
    }

    public void setAuralac(String auralac) {
        this.auralac = auralac;
    }

    public String getColanta() {
        return colanta;
    }

    public void setColanta(String colanta) {
        this.colanta = colanta;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getRoa() {
        return roa;
    }

    public void setRoa(String roa) {
        this.roa = roa;
    }


    @Override
    public String toString() {
        return "proveedores{" +
                "auralac='" + auralac + '\'' +
                ", colanta='" + colanta + '\'' +
                ", rama='" + rama + '\'' +
                ", roa='" + roa + '\'' +
                '}';
    }
}




