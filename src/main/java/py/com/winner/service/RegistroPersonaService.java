package py.com.winner.service;

import java.io.Serializable;

import javax.inject.Inject;

import py.com.winner.dao.PersonaDAO;
import py.com.winner.modelo.Persona;

public class RegistroPersonaService implements Serializable {
	
	@Inject
	private PersonaDAO personaDAO;
	
	public void guardar(Persona persona) throws NegocioException {
		if (persona.getGivenname() == null || persona.getGivenname().trim().equals("")){
			throw new NegocioException("El nombre del ciudadano es obligatorio cargar");
		}
		this.personaDAO.guardar(persona);
	}

}
