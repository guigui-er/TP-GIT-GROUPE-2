package nintendo.model;
import java.time.LocalDate;

<<<<<<< HEAD
=======

public abstract class Console {

    private String nom;          
    private double prix;
    private LocalDate dateSortie;

>>>>>>> origin/main

public class Console {

    private String nom;          
    private Integer prix;
    private LocalDate dateSortie;

    
	public Console(String nom, Integer prix, LocalDate dateSortie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}
    
}