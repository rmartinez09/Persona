package py.com.winner.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import py.com.winner.modelo.Persona;

public class PersonaDAO implements Serializable {
	
	@Inject
	private EntityManager em;
	
	public void guardar(Persona persona){
		//em.persist(persona);
		em.merge(persona);
	} 
}
