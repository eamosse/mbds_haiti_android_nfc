/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.edu.fds.mbds.android.bibliotheque.bean;

import ht.edu.fds.mbds.android.bibliotheque.Pret;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author edou
 */
@Stateless
public class PretFacade extends AbstractFacade<Pret> {
    @PersistenceContext(unitName = "BibliothequePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PretFacade() {
        super(Pret.class);
    }
    
}
