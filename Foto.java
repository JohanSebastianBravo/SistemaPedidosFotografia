public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Getter
    public String getFichero() {
        return fichero;
    }

    // Setter
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Imprimiendo foto desde " + fichero);
    }
}
