package cl.jrios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil {

	@Id
	private Integer idPerfil;

	@Column(name = "datosPersonales")
	private String datosPersonales;

	@Column(name = "formacionAcademica")
	private String formacionAcademica;

	public Perfil() {
		super();
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDatosPersonales() {
		return datosPersonales;
	}

	public void setDatosPersonales(String datosPersonales) {
		this.datosPersonales = datosPersonales;
	}

	public String getFormacionAcademica() {
		return formacionAcademica;
	}

	public void setFormacionAcademica(String formacionAcademica) {
		this.formacionAcademica = formacionAcademica;
	}

}
