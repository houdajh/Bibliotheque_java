package Personne;



public class Personne  {
    public String genre;
    public String nom;
    public String prenom;
    public String profession;



    public Personne(String genre, String nom ,String prenom, String profession) {
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;

    }

    public Personne() {

    }

    public String getGenre() {
        return genre;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getProfession() {
        return profession;
    }



    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }




    @Override
    public String toString() {
        return "Personne{" +
                "genre='" + genre + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}