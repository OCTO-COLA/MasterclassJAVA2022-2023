package masterclass.java.cola.restaurant.interfaces;

import masterclass.java.cola.restaurant.Plat;

import java.util.List;

public interface IFormule {
    String nom = null;
    List<Plat> composition = null;
    public String getNom();
    public void setNom(String nom);
    public List<Plat> getComposition();
}