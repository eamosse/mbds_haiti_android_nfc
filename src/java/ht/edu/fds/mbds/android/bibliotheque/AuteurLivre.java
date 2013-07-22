/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.edu.fds.mbds.android.bibliotheque;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author edou
 */
@Entity
@XmlRootElement
public class AuteurLivre implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Auteur auteur; 

    public Boolean getIsPrincipal() {
        return isPrincipal;
    }

    public void setIsPrincipal(Boolean isPrincipal) {
        this.isPrincipal = isPrincipal;
    }
    @ManyToOne
   
    private Livre livre;
    private Boolean isPrincipal; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuteurLivre)) {
            return false;
        }
        AuteurLivre other = (AuteurLivre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ht.edu.fds.mbds.android.bibliotheque.AuteurLivre[ id=" + id + " ]";
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
    
     @JsonIgnore
    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
    
    @Override
    public Object clone() {    
	    // On récupère l'instance à renvoyer par l'appel de la 
	    // méthode super.clone() (ici : Personne.clone())
	    AuteurLivre auteurLivre;
        try {
            auteurLivre = (AuteurLivre) super.clone();
            return auteurLivre;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(AuteurLivre.class.getName()).log(Level.SEVERE, null, ex);
        }
	    
	return null;
	    
  	}

    
}
