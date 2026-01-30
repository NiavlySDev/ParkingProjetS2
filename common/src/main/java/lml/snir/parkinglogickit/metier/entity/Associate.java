/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lml.snir.parkinglogickit.metier.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;
=======
import java.io.Serializable;
>>>>>>> origin/main

/**
 *
 * @author jupiter
 */
@Entity
public class Associate implements Serializable {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(nullable = false)
    private Badge badge;
    
    @OneToOne
    @JoinColumn(nullable = false)
    private Driver driver;
=======

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
>>>>>>> origin/main

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        
=======
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
>>>>>>> origin/main
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Associate)) {
            return false;
        }
        Associate other = (Associate) object;
<<<<<<< HEAD
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
=======
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
>>>>>>> origin/main
            return false;
        }
        return true;
    }

    @Override
<<<<<<< HEAD
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.badge);
        hash = 79 * hash + Objects.hashCode(this.driver);
        return hash;
    }

    @Override
    public String toString() {
        return "lml.snir.gestiontemperature.metier.entity.Attribution[ id=" + getId() + " ]";
    }

    /**
     * @return the badge
     */
    public Badge getBadge() {
        return badge;
    }

    /**
     * @param badge the badge to set
     */
    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    /**
     * @return the utilisateur
     */
    public Driver getUtilisateur() {
        return driver;
    }

    /**
     * @param utilisateur the utilisateur to set
     */
    public void setUtilisateur(Driver utilisateur) {
        this.driver = utilisateur;
    }
=======
    public String toString() {
        return "lml.snir.parklogickit.metier.entity.Associate[ id=" + id + " ]";
    }
    
>>>>>>> origin/main
}
