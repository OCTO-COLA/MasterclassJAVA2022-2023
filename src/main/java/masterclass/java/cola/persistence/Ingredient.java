package masterclass.java.cola.persistence;

import jakarta.persistence.*;

@Entity
public class Ingredient{
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        Long id;

        String nom;

        boolean allergene;

        int kipik;

        public Ingredient(String nom, boolean allergene, int kipik) {
                this.nom = nom;
                this.allergene = allergene;
                this.kipik = kipik;
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
                return kipik;
        }

        public void setKipik(int kipik) {
                this.kipik = kipik;
        }

        public Ingredient() {
        }
}