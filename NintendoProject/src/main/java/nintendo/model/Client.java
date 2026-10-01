package nintendo.model;

import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private List<Jeu> listeAchats;
    
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    
    public List<Jeu> getListeAchats() {
        return listeAchats;
    }

    public void setListeAchats(List<Jeu> listeAchats) {
        this.listeAchats = listeAchats;
    }
}
