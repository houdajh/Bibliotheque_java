package documents;


public class Livre extends Documents{
    private int nombre;
    private String type;
    private String tome;



    public Livre(int ISBN, String titre, String auteurs, String editeur, int ann_edition, int nb_exp, int nombre, String type, String tome) {
        super(ISBN, titre, auteurs, editeur, ann_edition, nb_exp);
        this.nombre = nombre;
        this.type = type;
        this.tome = tome;
    }

    public int getNombre() {
        return nombre;
    }

    public String getType() {
        return type;
    }

    public String getTome() {
        return tome;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTome(String tome) {
        this.tome = tome;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "nombre=" + nombre +
                ", type='" + type + '\'' +
                ", tome='" + tome + '\'' +
                "} " + super.toString();
    }
}
