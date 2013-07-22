/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.edu.fds.mbds.android.bibliotheque.service;

import ht.edu.fds.mbds.android.bibliotheque.Categorie;
import ht.edu.fds.mbds.android.bibliotheque.bean.AbstractFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author edou
 */
@Stateless
@Path("ht.edu.fds.mbds.android.bibliotheque.categorie")
public class CategorieFacadeREST extends AbstractFacade<Categorie> {
    @PersistenceContext(unitName = "BibliothequePU")
    private EntityManager em;

    public CategorieFacadeREST() {
        super(Categorie.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Categorie entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(Categorie entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Categorie find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Categorie> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Categorie> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
