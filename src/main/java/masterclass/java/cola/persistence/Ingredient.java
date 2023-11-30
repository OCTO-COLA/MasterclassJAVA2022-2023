package masterclass.java.cola.persistence;

import jakarta.persistence.*;

@Entity
public class Ingredient{
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        Long id;

        String nom;

        boolean allergene;

        int spicy;

        public Ingredient(String nom, boolean allergene, int spicy) {
                this.nom = nom;
                this.allergene = allergene;
                this.spicy = spicy;
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

        public boolean isAllergene() {
                return allergene;
        }

        public void setAllergene(boolean allergene) {
                this.allergene = allergene;
        }

        public int getKipik() {
                return spicy;
        }

        public void setKipik(int spicy) {
                this.spicy = spicy;
        }

        public Ingredient() {
        }
}