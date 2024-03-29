/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos.service;

import Alumnos.Alumnos;
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
 * @author chidalgol
 */
@Stateless
@Path("alumnos.alumnos")
public class AlumnosFacadeREST extends AbstractFacade<Alumnos> {
    @PersistenceContext(unitName = "AlumnosAppRESTPU")
    private EntityManager em;

    public AlumnosFacadeREST() {
        super(Alumnos.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Alumnos entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(Alumnos entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Alumnos find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Alumnos> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Alumnos> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
