package masterclass.java.cola.persistence;

import masterclass.java.cola.persistence.Ingredient;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Plat {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    @Column
    String nom;

    @Column
    Double prix;

    @Column
    int tempsPreparation;

    @OneToMany
    @JoinColumn(name="Plat_ID")
    List<Ingredient> ingredients;

    public Plat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getTempsPreparation() {
        return tempsPreparation;
    }

    public void setTempsPreparation(int tempsPreparation) {
        this.tempsPreparation = tempsPreparation;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Plat(String nom, Double prix, int tempsPreparation, List<Ingredient> ingredients) {
        this.nom = nom;
        this.prix = prix;
        this.tempsPreparation = tempsPreparation;
        this.ingredients = ingredients;
    }
}