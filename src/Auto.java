public class Auto {
    private String cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public Auto(String cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public String getCilindrata() {
        return cilindrata;
    }
    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata='" + cilindrata + '\'' +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
