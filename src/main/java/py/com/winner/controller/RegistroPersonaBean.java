package py.com.winner.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import py.com.winner.modelo.Persona;
import py.com.winner.service.NegocioException;
import py.com.winner.service.RegistroPersonaService;
import py.com.winner.util.jsf.FacesUtil;

@Named
@ViewScoped
public class RegistroPersonaBean implements Serializable {
	
	@Inject
	private RegistroPersonaService registroPersonaService;
	
	private Persona persona;

	public void guardar(){
		try {
			this.registroPersonaService.guardar(persona);
			FacesUtil.addSuccessMessage("Persona Registrada exitosamente!");
		} catch (NegocioException e) {
			FacesUtil.addErrorMessage(e.getMessage());
		}
	}
	
	@PostConstruct
	public void init(){
		this.limpiar();
	}
	
	public void limpiar(){
		this.persona = new Persona();
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	
}
