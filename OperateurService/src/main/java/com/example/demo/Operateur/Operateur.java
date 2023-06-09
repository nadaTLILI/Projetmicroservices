package com.example.demo.Operateur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Operateur implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idOperateur;
        private String nom;
        private String prenom;
        private String password;

        public Long getIdOperateur() {
            return idOperateur;
        }

        public void setIdOperateur(Long idOperateur) {
            this.idOperateur = idOperateur;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public Operateur() {
            super();
        }
        public Operateur(String nom, String prenom, String password) {
            this.nom = nom;
            this.prenom = prenom;
            this.password = password;
        }

}
